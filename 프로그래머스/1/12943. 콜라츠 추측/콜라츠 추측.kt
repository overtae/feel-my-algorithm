class Solution {
    fun solution(num: Int): Int {
        var number = num.toLong()
        
        if (num == 1) return 0
        
        for (i in 1..500) {
            number = if (number % 2 == 0L) number / 2 else number*3 + 1
            if (number == 1L) return i
        }
        
        return -1
    }
}