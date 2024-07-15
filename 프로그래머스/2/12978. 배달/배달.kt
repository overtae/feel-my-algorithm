import java.util.*

class Solution {
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        // 1부터 N번째 마을까지의 (제일 짧은) 소요 시간이
        // k보다 작은 마을 count
        
        // 마을 그래프 (양방향)
        val town = Array(N+1) { arrayListOf<Pair<Int, Int>>() }.apply {
            road.forEach { (start, end, time) ->
                this[start].add(end to time)
                this[end].add(start to time)
            }
        }                   // end, time
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        val times = Array(N+1) { k*2 }

        queue.add(1 to 0)
        times[1] = 0
        
        // 탐색
        while (queue.isNotEmpty()) {
            val (_end, _time) = queue.poll()
            town[_end].forEach { (end, time) ->
                // 기존 소요 시간보다 현재 소요 시간보다 작다면 값 갱신
                if (times[end] > times[_end] + time) {
                    times[end] = times[_end] + time
                    queue.add(end to time)
                }
            }
        }

        return times.filter { it <= k }.size
    }
}