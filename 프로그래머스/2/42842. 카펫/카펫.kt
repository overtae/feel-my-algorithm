class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        // (yellow/a * 2) + (a * 2) + 4 = brown
        val divider = (1..yellow).filter { yellow % it == 0 }
        val row = divider.first { 
            brown == (yellow / it * 2) + it * 2 + 4
        }
        
        return intArrayOf(yellow/row + 2, row + 2)
    }
}