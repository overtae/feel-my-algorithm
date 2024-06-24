class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val days = progresses.mapIndexed { i, p ->
            (100 - p) / speeds[i] + if ((100 - p) % speeds[i] > 0) 1 else 0
        }
        var answer = IntArray(100) {0}
        var max = 0
        var day = -1
        
        for (i in days.indices) {
            if (max < days[i]) {
                max = days[i]
                day++
            }
            answer[day]++
        }
        
        return answer.filter { it != 0 }.toIntArray()
    }
}