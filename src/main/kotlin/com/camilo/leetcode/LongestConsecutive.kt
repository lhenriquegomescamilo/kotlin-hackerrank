package com.camilo.leetcode

class LongestConsecutive {
    fun longestConsecutive(nums: IntArray): Int {
        nums.size
        val sets = nums.toHashSet()
        var longestConsecutive = 0
        for (m in nums) {
            var temp = m + 1
            var counterConsecutive = 1
            while (!sets.contains(m - 1) && sets.contains(temp)) {
                temp++
                counterConsecutive++
            }
            longestConsecutive = Math.max(longestConsecutive, counterConsecutive)
        }

        return longestConsecutive
    }
}

/*
MATCH (m:Movie)
UNWIND m.languages AS language
WITH language, collect(m) AS movies
MERGE (l:Language {name:language})
WITH l, movies
UNWIND movies AS m
WITH l,m
MERGE (m)-[:IN_LANGUAGE]->(l)
 */