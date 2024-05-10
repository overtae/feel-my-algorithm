class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var change = money - price * ((1L + count) * count / 2)

        return if (change < 0) -change else 0
    }
}