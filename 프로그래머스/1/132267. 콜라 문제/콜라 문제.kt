class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var (div, mod) = Pair(n/a * b, n%a)
        var answer: Int = div
        
        while ((div + mod) >= a) {
            var notUsed = div + mod
            div = notUsed/a * b
            mod = notUsed%a
            answer += div
        }
        
        return answer
    }
}