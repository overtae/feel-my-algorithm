class Solution {
    fun solution(numbers: IntArray): IntArray {
        var len = numbers.size - 1
        
        return (0..len-1).flatMap { (it+1..len).map { i -> numbers[it] + numbers[i] } }.sorted().toSet().toIntArray()
    }
}