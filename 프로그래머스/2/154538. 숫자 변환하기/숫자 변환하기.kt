import java.util.*

class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        var visited: HashMap<Int, Boolean> = hashMapOf()
        var q: Queue<Pair<Int, Int>> = LinkedList()
        
        fun exec(y: Int, type: Int) = when (type) {
            0 -> y - n
            1 -> if (y % 2 == 0) y / 2 else 0
            else -> if (y % 3 == 0) y / 3 else 0
        }
        
        fun solve(y: Int, cnt: Int): Int {
            q.add(y to cnt)
            
            while (q.isNotEmpty()) {
                val (current, count) = q.poll()

                if (current == x) return count

                (0..2).map {
                    val next = exec(current, it)
                    if (next >= x && !(visited[next] ?: false)) {
                        visited[next] = true
                        q.add(next to count + 1)
                    }
                }
            }
            return -1
        }
        
        return solve(y, 0)
    }
}