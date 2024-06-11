class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val all = brown + yellow
        val sq = Math.sqrt(all.toDouble()).toInt()
        val divider = (1..sq).filter { all % it == 0 }
        var answer = intArrayOf()
        
        divider.map {
            val (x, y) = all/it to it
            if ((x - 2) * (y - 2) == yellow)
                answer = intArrayOf(x, y)
        }
        
        return answer
    }
}