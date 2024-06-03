class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var t = terms.map { 
            var (k, v) = it.split(" ")
            k to v.toInt()
        }.toMap()
        var answer: IntArray = intArrayOf()
        
        privacies.mapIndexed { i, p ->
            var (date, type) = p.split(" ")
            var (y, m, d) = date.split(".").map { it!!.toInt() }
            var term = t[type]!!
            
            y += term / 12
            m += term % 12
            d -= 1
            
            if (d == 0) {
                m -= 1
                d = 28
            }
            if (m == 0) {
                y -= 1
                m = 12
            }
            if (m > 12) {
                y += 1
                m %= 12
            }
            
            var str = String.format("%d.%02d.%02d", y, m, d)
            if (str < today) answer += i + 1
            println(str)
        }
        
        return answer
    }
}