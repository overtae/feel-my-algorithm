class Solution {
    fun solution(X: String, Y: String): String {
        var same = ('0'..'9').map { n ->
            arrayOf(X.count { it == n }, Y.count { it == n }).minOrNull()!! }
        var str = (9.downTo(0)).fold("") { t, i ->
            t + "$i".repeat(same[i])
        }
        
        return if (str == "") "-1" else if (str.all{ it == '0' }) "0" else str
    }
}