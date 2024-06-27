import kotlin.math.sqrt

class Solution {
    fun checkIsPrime(n: String): Boolean {
        val num = n.toLong()
        val sq = sqrt(n.toDouble()).toLong()
        return num != 1L && (2..sq).all { num % it != 0L }
    }
    
    fun solution(n: Int, k: Int): Int {
        val numbers = n.toString(k).split('0').filter(String::isNotBlank)
        
        return numbers.count { checkIsPrime(it) }
    }
}