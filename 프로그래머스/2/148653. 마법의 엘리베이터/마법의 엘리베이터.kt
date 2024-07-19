import kotlin.math.*

class Solution {
    fun solution(storey: Int): Int {
        return countStone(storey)
    }
    
    fun countStone(s: Int, cnt: Int = 0): Int {
        if (s == 0) return cnt
        val current = s % 10
        
        return when (current) {
            in 0..4 -> countStone(s/10, cnt + current)
            in 6..9 -> countStone((s+10)/10, cnt + 10 - current)
            else -> countStone((if (s/10%10 > 4) s+10 else s)/10, cnt + current)
        }
    }
}