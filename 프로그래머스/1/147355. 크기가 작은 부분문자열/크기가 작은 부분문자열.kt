class Solution {
    fun solution(t: String, p: String): Int {
//         var answer: Int = 0
        
//         for (i in 0..t.length-p.length) {
//             if (t.substring(i, i+p.length).toLong() <= p.toLong()) answer++
//         }
        
//         return answer
        
        return (0..t.length-p.length).filter {
            t.substring(it, it+p.length) <= p
        }.size
    }
}