import java.util.Stack

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        
        for (i in s.indices) {
            val stack = Stack<Char>()
            val str = s.substring(i) + s.substring(0, i)
            
            for (c in str) {
                val recent = if (stack.isNotEmpty()) stack.peek() else ' '

                when {
                    (c == ')') && (recent == '(') -> stack.pop()
                    (c == '}') && (recent == '{') -> stack.pop()
                    (c == ']') && (recent == '[') -> stack.pop()
                    else -> stack.push(c)
                }
            }
            if (stack.isEmpty()) answer++
        }
        
        return answer
    }
}