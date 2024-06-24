class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val q = MutableList(priorities.size, {i -> i to priorities[i]})
        var max = priorities.maxOrNull() ?: 1
        
        while (true) {
            val current = q.removeAt(0)
            
            if (current.second == max) {
                answer++
                
                if (current.first == location) break
            } else {
                q.add(current)
                continue
            }
            max = q.maxOfOrNull { it.second } ?: 1
        }
        
        return answer
    }
}