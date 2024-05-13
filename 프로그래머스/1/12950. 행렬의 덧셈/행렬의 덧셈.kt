class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return arr1.mapIndexed { i, a -> a.mapIndexed { j, aa -> aa + arr2[i][j] }.toIntArray() }.toTypedArray()
    }
}