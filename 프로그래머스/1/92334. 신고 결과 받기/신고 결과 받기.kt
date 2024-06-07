class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var realReport = report.toSet().map { it.split(" ") }.groupBy({ it.last() }, { it.first() }).filter { it.value.size >= k }
        var idList = id_list.associate { it to 0 }.toMutableMap()
        
        
        realReport.map {
            it.value.map { userId ->
                idList[userId] = idList[userId]!! + 1
            }
        }
        
        return idList.values.toIntArray()
    }
}