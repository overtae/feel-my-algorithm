class Solution {
    fun fibo(x: Int, y: Int, cnt: Int): Int {
        return if (cnt == 0) (x + y) % 1234567 else fibo(y % 1234567, (x + y) % 1234567, cnt - 1)
    }
    
    fun solution(n: Int): Int {
        return fibo(0, 1, n - 2)
    }
}