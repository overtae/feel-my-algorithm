class Solution {
    // 최대 공약수
    tailrec fun gcd(x: Int, y: Int): Int = if (x % y == 0) y else gcd(y, x%y)
    
    fun solution(n: Int, m: Int): IntArray {
        // 최소 공배수 = n * m / gcd
        return intArrayOf(gcd(n, m), n*m/gcd(n, m))
    }
}