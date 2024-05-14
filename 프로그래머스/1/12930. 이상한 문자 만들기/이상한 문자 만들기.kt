class Solution {
    fun solution(s: String): String {
        var answer = ""
        
        for (word in s.split(" ")) {
            for (i in 0..word.length-1) {
                with(word[i]) {
                    answer += if (i % 2 == 0) toUpperCase() else toLowerCase()
                }
            }
            answer += " "
        }
        
        return answer.substring(0, s.length)
    }
}