class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var realReserve = reserve.filter { it !in lost }.sorted()
        var realLost = lost.filter { it !in reserve }.toMutableList()
        
        realReserve.map {
            when {
                realLost.contains(it-1) -> realLost.removeAt(realLost.indexOf(it-1))
                realLost.contains(it+1) -> realLost.removeAt(realLost.indexOf(it+1))
                else -> 0
            }
        }
        
        return n - realLost.size
    }
}