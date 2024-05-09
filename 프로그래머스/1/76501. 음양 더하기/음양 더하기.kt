class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        return absolutes.foldIndexed(0) { idx, total, num -> total + if(signs[idx]) num else -num }
    }
}