class Solution {
    fun solution(food: IntArray): String {
        var half = food.foldIndexed("") { i, s, n -> s + "${"$i".repeat(n / 2)}" }
        
        return "${half}0${half.reversed()}"
    }
}