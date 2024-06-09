class Solution {
    fun solution(s: String): IntArray {
        var str = s
        var answer: IntArray = intArrayOf(0, 0)
        
        
        while (str != "1") {
            answer[0] += 1
            answer[1] += str.count { it == '0' }
            str = str.count { it == '1' }.toString(2)
        }
        
        
        return answer
    }
}