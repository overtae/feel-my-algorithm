class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val tang = tangerine.groupBy { it }.map { it.key to it.value.size }.sortedByDescending { it.second }
        var box = 0
        var answer: Int = 0
        
        tang.map {
            if (box >= k) return answer
            answer++
            box += it.second
        }
        
        return tang.size
    }
}