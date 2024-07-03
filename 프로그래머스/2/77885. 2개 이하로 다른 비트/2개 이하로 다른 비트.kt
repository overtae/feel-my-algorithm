import java.util.*

class Solution {
    fun solution(numbers: LongArray): LongArray {
        var answer: LongArray = longArrayOf()
        val s = Stack<Int>()
        
        numbers.map { 
            // 짝수: 가장 마지막 자리 수를 1로 변경 (10 -> 11)
            // 홀수: 1. 가장 마지막 "0"의 자리 수를 1로 변경 (01 -> 11)
            //       2. 구한 "0"의 자리수 다음 자리를 0으로 변경 (11 -> 10)
            val s = StringBuilder("0" + it.toString(2))
            
            if (it % 2 == 0L) {
                s.setCharAt(s.length - 1, '1')
            } else {
                val idx = s.lastIndexOf("0")
                
                s.setCharAt(idx, '1')
                s.setCharAt(idx + 1, '0')
            }
            
            answer += s.toString().toLong(2)
        }
        
        return answer
    }
}