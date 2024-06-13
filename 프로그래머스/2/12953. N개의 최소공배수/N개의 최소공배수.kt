class Solution {
    tailrec fun gcd(x: Int, y: Int): Int = if (x % y == 0) y else gcd(y, x % y)
    
    fun solution(arr: IntArray): Int {
        // lcm = (X * Y) / gcd
        var answer = arr[0]
        
        (1..arr.size-1).map {
            answer = answer * arr[it] / gcd(answer, arr[it])
        }
        
        return answer
    }
}