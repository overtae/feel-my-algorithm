class Solution {
    fun solution(s: String): Boolean {
        return arrayOf(4, 6).contains(s.length) and s.all { it.isDigit() }
    }
}