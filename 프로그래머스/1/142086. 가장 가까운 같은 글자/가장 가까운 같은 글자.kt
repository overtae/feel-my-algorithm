class Solution {
    fun solution(s: String): IntArray {
        return (0..s.length-1).map {
            s.slice(0..it-1).lastIndexOf(s[it])
        }.mapIndexed { i, n -> if (n != -1) i-n else n }.toIntArray()
    }
}