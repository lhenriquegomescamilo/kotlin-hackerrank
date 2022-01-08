package com.camilo

fun repeatedString(s: String, n: Long): Long {
    val letterA = 'a'
    val size = s.length
    if (size == 1 && s[0] != letterA) return 0
    if (size == 1) return n

    var lettersAOnPhrase = 0
    for (i in 0 until size) if (s[i] == letterA) lettersAOnPhrase++


    var totalLetterA: Long = 0
    val numberOfLoops = (n / size)
    totalLetterA = lettersAOnPhrase * numberOfLoops

    val remainderOfLoop = n - (numberOfLoops * size)
    for (i in 0 until remainderOfLoop) {
        if (s[((i % size).toInt())] == letterA) totalLetterA++
    }

    return totalLetterA
}