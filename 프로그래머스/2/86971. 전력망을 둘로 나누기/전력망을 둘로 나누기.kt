import java.util.*

class Solution {
    fun solution(n: Int, wires: Array<IntArray>): Int {
        // 연결된 노드 리스트 (양방향)
        val rel = Array(n+1) { arrayListOf<Int>() }.apply {
            for ((x, y) in wires) { 
                this[x].add(y)
                this[y].add(x)
            }
        }
        
        var answer: Int = n
    
        // 너비 우선 탐색
        fun solve(s: Int, e: Int): Int {
            val queue: Queue<Int> = LinkedList()
            val visited = BooleanArray(n + 1)
            var cnt = 1
            
            visited[s] = true
            queue.add(s)
            
            while(queue.isNotEmpty()) {
                rel[queue.poll()].forEach { 
                    if (!visited[it] && it != e) {
                        cnt++
                        visited[it] = true
                        queue.add(it)
                    }
                }
            }
            return cnt
        }
        
        for (w in wires) {
            val t1 = solve(w[0], w[1])
            val t2 = solve(w[1], w[0])
            answer = answer.coerceAtMost(Math.abs(t1 - t2))
        }
        
        return answer
    }
}