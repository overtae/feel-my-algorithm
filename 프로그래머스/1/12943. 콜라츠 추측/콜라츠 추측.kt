class Solution {
    fun solution(num: Int): Int {
        var number = num
        
        if (num == 1) return 0
        
        for (i in 1..400) {
            number = if (number % 2 == 0) number / 2 else number*3 + 1
            if (number == 1) return i
        }
        
        return -1
    }
}