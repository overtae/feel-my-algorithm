class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        return a.foldIndexed(0) { i, total, n -> total + n * b[i] }
    }
}