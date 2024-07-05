import java.util.*

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        var cur = 0
        var weightSum = 0
        val q = LinkedList<Int>() as Queue<Int>
        
        while (true) {
            answer += 1
            
            if (q.size  >= bridge_length) {
                val item = q.poll()
                if (item >= 0) {
                    weightSum -= truck_weights[item]

                    if (item  == truck_weights.size - 1) break
                }
            }

            if (cur < truck_weights.size && weightSum + truck_weights[cur] <= weight) {
                q.add(cur)

                weightSum += truck_weights[cur]
                cur += 1
            } else {
                q.add(-1)
            }
        }
        return answer
    }
}