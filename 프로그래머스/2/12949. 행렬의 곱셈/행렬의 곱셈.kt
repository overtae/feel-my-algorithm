class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        
        return arr1.indices.map { i ->
            arr2[0].indices.map { j ->
                arr1[i].foldIndexed(0) { idx, total, v ->
                    total + v * arr2[idx][j]
                }
            }.toIntArray()
        }.toTypedArray()
    }
}