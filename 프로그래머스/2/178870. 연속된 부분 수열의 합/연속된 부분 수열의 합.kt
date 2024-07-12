class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        val dq = ArrayDeque<Int>()
        var sum = 0
        var l = sequence.size + 1
        var (start, end) = 0 to 0
        var answer = intArrayOf()
        
        sequence.indices.map { i ->
            dq.addLast(i)
            end = i
            sum += sequence[i]
            
            while (sum > k) {
                sum -= sequence[dq.first()]
                dq.removeFirst()
                start++
            }
            if (sum == k && end - start < l) {
                answer = intArrayOf(start, end)
                l = end - start
            }
        }
        
        return answer
    }
}