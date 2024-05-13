class Solution {
    fun solution(n: Int): Int {
        var s = ""
        var div = n
        
        while (div != 0) {
            s += (div%3).toString()
            div /= 3
        }
        
        return s.toInt(3)
    }
}