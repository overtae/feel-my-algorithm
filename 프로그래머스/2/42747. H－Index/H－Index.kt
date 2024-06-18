class Solution {
    fun solution(citations: IntArray): Int {
        val sortedArr = citations.sortedDescending()
        
        return (citations.size downTo 1).firstOrNull { h ->
            sortedArr[h - 1] >= h
        } ?: 0
    }
}