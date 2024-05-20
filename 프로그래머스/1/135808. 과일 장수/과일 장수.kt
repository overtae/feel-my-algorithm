class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var sortedScore = score.sortedDescending()
        var lastIdx = score.size - score.size%m - 1
        
        return (m-1..lastIdx step(m)).fold(0) { total, i -> 
            total + sortedScore[i] * m
        }
    }
}