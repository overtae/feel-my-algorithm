class Solution {
    fun solution(n: Int): String {
        return "수박".repeat(n/2) + "수".repeat(n%2)
    }
}