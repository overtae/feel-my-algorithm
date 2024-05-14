class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxSizes = sizes.map { Math.max(it[0], it[1]) }
        var minSizes = sizes.map { Math.min(it[0], it[1]) }
        
        return maxSizes.maxOrNull()!! * minSizes.maxOrNull()!!
    }
}