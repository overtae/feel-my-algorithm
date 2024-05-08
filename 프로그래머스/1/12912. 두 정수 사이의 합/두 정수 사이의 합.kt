class Solution {
    fun solution(a: Int, b: Int): Long {
        val start : Long = (if(a>b) b else a).toLong()
        val end : Long = (if(a>b) a else b).toLong()
        return (start..end).sum()
    }
}