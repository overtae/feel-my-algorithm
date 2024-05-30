class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val alpha = ('a'..'z').filterNot(skip::contains)

        return s.map { 
            alpha[(alpha.indexOf(it) + index) % alpha.size]
        }.joinToString("")
    }
}