class Solution {
    fun solution(weights: IntArray): Long {
        
        var answer: Long = 0
        val hm = hashMapOf<Double, Int>()
        
        for (w in weights.sorted()) {
            // 2, 3, 4 
            // 1:1, 1:2, 2:3, 3:4
            if (hm.containsKey(w*1.0)) answer += hm[w*1.0] ?: 0
            if (hm.containsKey(w*1/2.0)) answer += hm[w*1/2.0] ?: 0
            if (hm.containsKey(w*2/3.0)) answer += hm[w*2/3.0] ?: 0
            if (hm.containsKey(w*3/4.0)) answer += hm[w*3/4.0] ?: 0
            hm[w*1.0] = hm.getOrDefault(w*1.0, 0) + 1
        }
        
        return answer
    }
}