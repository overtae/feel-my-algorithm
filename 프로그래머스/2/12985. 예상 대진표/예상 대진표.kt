class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var (numA, numB) = a to b
        var answer = 0
        
        (1..20).map {
            if (numA - numB == 1 || numA - numB == -1) answer = it
            
            numA = (numA + 1) / 2
            numB = (numB + 1) / 2
        }
        
        return answer
    }
}