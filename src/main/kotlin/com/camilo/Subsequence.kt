package com.camilo

/**
 * Exmaple:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 */
class Subsequence {

    fun isSubsequence(compare: String, source: String): Boolean {
        val map = LinkedHashMap<Int, Char>(compare.length)

        for (i in compare.indices) {
            for (j in i until source.length) {
                if (compare[i] == source[j]) {
                    map[j] = source[j]
                }
            }
        }
        val mapSorted = map.toSortedMap()
        val builder = StringBuilder()
        for((_, v) in mapSorted) {
            if(!builder.contains(v)) builder.append(v)

        }
        return compare == builder.toString()
    }
}