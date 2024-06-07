class Solution {
    fun solution(s: String): String {
        return s.split(" ").map(String::toInt).let { "${it.minOrNull()} ${it.maxOrNull()}" }
    }
}