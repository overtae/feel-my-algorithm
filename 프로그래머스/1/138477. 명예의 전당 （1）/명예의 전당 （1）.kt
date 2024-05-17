class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var top: IntArray = IntArray(k) { -1 }
        
        for (s in score) {
            var min = top.minOrNull()!!
            
            if (s > min) {
                top[top.indexOf(min)] = s
                answer += top.filter { it >= 0 }.minOrNull()!!
            } else {
                answer += min
            }
        }
        
        return answer
    }
}