class Solution {
    fun solution(k: Int, d: Int): Long {
        // (0, 0)과 (x, y)의 거리 = d
        // x^2 + y^2 = d^2
        // y^2 = d^2 - x^2
        return (0..d step k).fold(0L) { total, x ->
            val y = d*d.toLong() - x*x.toLong()
            total + Math.sqrt(y.toDouble()).toLong() / k + 1
        }
    }
}