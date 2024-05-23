class Solution {
    fun dmg(num: Int): Int {
        var n = Math.sqrt(num * 1.0)
        var result = (1..n.toInt()).count { num % it == 0 } * 2
        
        return if (n % 1 == 0.0) result - 1 else result 
    }
    
    fun solution(number: Int, limit: Int, power: Int): Int {
        return (1..number).map { if (dmg(it) > limit) power else dmg(it) }.sum()
    }
}