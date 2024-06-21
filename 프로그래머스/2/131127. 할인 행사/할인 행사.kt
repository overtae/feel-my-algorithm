class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var w = want.associate { it to number[want.indexOf(it)] }
        
        return (0..discount.size-10).count { i ->
            val buy = discount.slice(i..i+9).groupBy { it }
            buy.all { it.value.size == w[it.key] }
        }
    }
}