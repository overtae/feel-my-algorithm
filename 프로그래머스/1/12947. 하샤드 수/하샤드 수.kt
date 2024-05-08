class Solution {
    fun solution(x: Int): Boolean {
        var sum = x.toString().fold(0) { sum, num -> sum + num.digitToInt() }
        
        return if (x % sum == 0) true else false
    }
}