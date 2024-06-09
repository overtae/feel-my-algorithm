class Solution {
    fun solution(s: String): String {
        return s.indices.map {
            if (it == 0 || (it > 0 && s[it-1] == ' ')) s[it].toUpperCase()
            else s[it].toLowerCase()
        }.joinToString("")
    }
}