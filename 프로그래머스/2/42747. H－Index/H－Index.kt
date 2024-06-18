class Solution {
    fun solution(citations: IntArray): Int {
        return (citations.size downTo 1).firstOrNull { h ->
            citations.count { it >= h } >= h
        } ?: 0
    }
}