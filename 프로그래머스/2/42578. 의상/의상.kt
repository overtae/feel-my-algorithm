class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val c = clothes.groupBy ({ it[1] }, { it[0] })
        val answer = c.values.fold(1) { total, n ->
            total * (n.size + 1)
        }
        return answer - 1
    }
}