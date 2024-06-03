class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var t = terms.map { it.split(" ") }.associate { (a, b) -> a to b.toInt() }
        var td = today.split(".").map(String::toInt).let { (y, m, d) -> 
            (y * 12 * 28) + (m * 28) + d }
        var answer: IntArray = intArrayOf()
        
        privacies.mapIndexed { i, p ->
            var (date, type) = p.split(" ")
            var (y, m, d) = date.split(".").map { it!!.toInt() }
            var term = (y * 12 * 28) + ((m + t[type]!!) * 28) + d - 1
            
            if (term < td) answer += i + 1
        }
        
        return answer
    }
}