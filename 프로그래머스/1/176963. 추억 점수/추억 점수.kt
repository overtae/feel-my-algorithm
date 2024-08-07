class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        return photo.map { p ->
            name.foldIndexed(0) { i, total, n ->
                total + p.count { it == name[i] } * yearning[i]
            }
        }.toIntArray()
    }
}