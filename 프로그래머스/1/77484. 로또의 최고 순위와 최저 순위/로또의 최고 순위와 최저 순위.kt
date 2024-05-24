class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var ifEqual = lottos.count { it == 0 }
        var equal = lottos.count { win_nums.contains(it) }
        var max = 7 - equal - ifEqual
        var min = 7 - equal 
        
        return intArrayOf(Math.min(max, 6), Math.min(min, 6))
    }
}