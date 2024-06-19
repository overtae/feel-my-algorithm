class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        val len = (right - left).toInt()
        val cols = (right/n - left/n).toInt()
        val realStart = (left % n).toInt()
        
        val list = List(cols+1) { col -> List(n) { row -> if (left/n+col > row) (left/n+col+1).toInt() else row+1 } }
        
        return list.flatten().slice(realStart..realStart+len).toIntArray()
    }
}