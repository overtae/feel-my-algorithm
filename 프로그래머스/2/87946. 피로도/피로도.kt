class Solution {
    var answer = 0
    
    fun explore(p: Int, dg: List<IntArray>, c: Int = 0): Int {
        var cnt = 0
        for (d in dg) {
            if (d[0] <= p) {
                val left = dg.filter { it != d }
                cnt = explore(p - d[1], left, c + 1)
                if (cnt > answer) answer = cnt
            }
        }
        return if (answer > c) answer else c
    }
    
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        explore(k, dungeons.toList())
        
        return answer
    }
}