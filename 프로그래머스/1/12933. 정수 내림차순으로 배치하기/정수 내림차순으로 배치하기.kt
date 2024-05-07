class Solution {
    fun solution(n: Long): Long {
        var sortedNum = n.toString().map { it.digitToInt() }.sorted().reversed()
        
        return sortedNum.joinToString(separator = "").toLong()
    }
}