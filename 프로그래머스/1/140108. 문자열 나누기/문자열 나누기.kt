class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var c = '1'
        var flag = 0
        var diff = 0
        
        for (i in 0..s.lastIndex) {
            if (flag == diff) {
                c = s[i]
                answer++
            }
            
            if (s[i] == c) flag++ else diff++
        }
        
        return answer
    }
}