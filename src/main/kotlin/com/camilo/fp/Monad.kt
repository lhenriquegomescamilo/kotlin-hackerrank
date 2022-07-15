package com.camilo.fp

/**
 *
 * Monads are a design pattern that allows a user to chain operation
 * while the monad manages secret work behind the scenes
 *
 * Main concepts regarding of Monad
 * 1. Wrapper Type: In this case is NumberWithLogs
 * 2. Wrap Function: Allows entry to monad ecosystem, in our example is: fun wrapWithLogs(x: Int): NumberWithLogs
 *    Also known as: return, pure, unit and etc.
 *
 * 3. Run Function, run transformation on monadic values, in our example is: runWithLogs
 *    Also known as: bind, flatMap, pipe, compose and etc.
 */

data class NumberWithLogs(val result: Int, val logs: MutableList<String>) {
    fun runWithLogs(transform: (_: Int) -> NumberWithLogs): NumberWithLogs {
        val newNumberWithLogs = transform(result)
        return NumberWithLogs(
            result = newNumberWithLogs.result,
            logs = logs.plus(newNumberWithLogs.logs).toMutableList()
        )
    }

}

fun square(x: Int) = NumberWithLogs(result = x * x, logs = mutableListOf("Squared $x to get ${x * x}"))

fun addOne(x: Int) = NumberWithLogs(
    result = x + 1,
    logs = mutableListOf("Added 1 to $x to get ${x + 11}")
)

fun wrapWithLogs(x: Int): NumberWithLogs = NumberWithLogs(result = x, logs = mutableListOf())

fun main(vararg args: String) {
    val result = wrapWithLogs(5)
        .runWithLogs(::square)
        .runWithLogs(::addOne)

    println(result)
}