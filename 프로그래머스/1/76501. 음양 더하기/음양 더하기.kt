class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        return absolutes.toList().zip(signs.toList()).map { if (it.second) it.first else -it.first }.sum()
    }
}