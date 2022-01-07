package com.camilo

fun repeatedString(s: String, n: Long): Long {
    val letterA = 'a'
    val size = s.length
    if (size == 1 && s[0] != letterA) return 0
    if (size == 1) return n
    var totalLetterA: Long = 0
    for(i in 0 until n){
        if(s[((i % size).toInt())] == letterA) totalLetterA++
    }

    return (totalLetterA)
}
/*
1st version of code

fun repeatedString(s: String, n: Long): Long {
    val letterA = 'a'
    val lengthOfInput = s.length
    if (lengthOfInput == 1 && s[0] != letterA) return 0
    if (lengthOfInput == 1) return n
    var fullNumberOfLettersA = 0

    for (index in 0 until lengthOfInput) if (s[index] == 'a') fullNumberOfLettersA++

    var counter = 0
    var quantityOfLetters = 0
    for (i in 0 until n) {
        if (counter > (n - lengthOfInput)) {
            if (fullNumberOfLettersA % 2 != 0) break
            quantityOfLetters += (fullNumberOfLettersA / 2)
            break
        }
        quantityOfLetters += fullNumberOfLettersA
        counter += lengthOfInput


    }
    return quantityOfLetters.toLong()
}

 */