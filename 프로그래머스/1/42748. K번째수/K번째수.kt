class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { (i, j, k) -> 
            array.slice(i-1..j-1).sorted()[k-1]
        }.toIntArray()
    }
}