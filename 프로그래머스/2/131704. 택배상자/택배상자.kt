import java.util.*

class Solution {
    fun solution(order: IntArray): Int {
        var answer: Int = 0
        var stack = Stack<Int>()
        
        (1..order.size).map { i ->
            // 메인 컨베이어 벨트에서 꺼낼 수 있는 경우
            if (order[answer] == i) answer++
            // 없는 경우
            else stack.push(i)
            // 서브 컨베이어 벨트에서 현재 상자까지 꺼낸다. 
            while (stack.isNotEmpty() && stack.peek() == order[answer]) {
                stack.pop()
                answer++
            }
        }
        
        return answer
    }
}