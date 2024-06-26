class Solution {
    var answer = 0
    
    fun seek(i: Int, sum: Int, numbers: IntArray, target: Int) {
        if (i == numbers.size) {
            if (sum == target) answer += 1
            return
        }
        seek(i+1, sum+numbers[i], numbers, target)
        seek(i+1, sum-numbers[i], numbers, target)
    }
    
    fun solution(numbers: IntArray, target: Int): Int {
        seek(0, 0, numbers, target)
        return answer
    }
}