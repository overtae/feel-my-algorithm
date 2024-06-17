import java.util.Stack

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0

        s.indices.map { i ->
            val stack = Stack<Char>()
            val str = s.substring(i) + s.substring(0, i)
            
            str.map {
                val recent = if (stack.isNotEmpty()) stack.peek() else ' '

                when (it) {
                    ')' -> if (recent == '(') stack.pop() else stack.push(it)
                    '}' -> if (recent == '{') stack.pop() else stack.push(it)
                    ']' -> if (recent == '[') stack.pop() else stack.push(it)
                    else -> stack.push(it)
                }
            }
            if (stack.isEmpty()) answer++
        }
        
        return answer
    }
}