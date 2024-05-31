class Solution {
    fun solution(ingredient: IntArray): Int {
        val sb = StringBuilder()
        var answer = 0
        
        for (i in ingredient) {
            sb.append(i)
            if (sb.length >= 4 && sb.takeLast(4) == "1231") {
                sb.delete(sb.length-4, sb.length)
                answer++
            }
        }

        return answer
    }
}