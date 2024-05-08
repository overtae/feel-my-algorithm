class Solution {
    fun solution(a: Int, b: Int): Long {
        
        return if (a == b) a.toLong() else if (a > b) (b..a.toLong()).sum() else (a..b.toLong()).sum()
    }
}