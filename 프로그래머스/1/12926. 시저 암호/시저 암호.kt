class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        
        for (c in s) {
            if (c.isLowerCase())
                answer += 'a' + (c.toInt() + n - 'a'.toInt()) % 26
            else if (c.isUpperCase())
                answer += 'A' + (c.toInt() + n - 'A'.toInt()) % 26
            else answer += ' '
        }
        
        return answer
    }
}