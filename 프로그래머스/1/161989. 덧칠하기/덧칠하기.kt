class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var wall = Array(n) { i -> !section.contains(i+1) }
        var answer = 0
        
        for (i in wall.indices) {
            if (!wall[i]) {
                var end = if (i+m-1 >= wall.size) wall.size-1 else i+m-1
                (i..end).map { wall[it] = true }
                answer++
            }
        }
        
        return answer
    }
}