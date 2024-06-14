class Solution {
    fun solution(n: Int): Long {
        // 1, 2, 3, 5, 8, ...
        var (x, y) = 1L to 1L
        
        repeat(n) {
            var temp = x
            
            x = y % 1234567
            y = (temp + y) % 1234567
            println("$x $y")
        }
        
        return x
    }
}