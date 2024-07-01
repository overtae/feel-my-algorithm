import java.util.Stack

class Solution {
    fun solution(numbers: IntArray): IntArray {
        // numbers를 돌며, 스택에 인덱스를 쌓는다.
        // 이 때 현재 탐색 중인 요소를 n, 스택에서 pop한 인덱스를 idx라 한다.
        // numbers[idx]가 n보다 작으면,
        // numbers[idx]의 뒷 큰 수는 n이다.
        // 위 문장을 스택이 빌 때까지 반복한다. 
        // 스택에는 "뒷 큰수를 구하지 못한 인덱스"들이 쌓이게 된다.
        val stack = Stack<Int>()
        val answer = IntArray(numbers.size) {-1}
        
        numbers.mapIndexed { i, n ->
            while (stack.size != 0 && numbers[stack.peek()] < n) {
                answer[stack.pop()] = n
            }
            stack.push(i)
        }
        
        return answer
    }
}