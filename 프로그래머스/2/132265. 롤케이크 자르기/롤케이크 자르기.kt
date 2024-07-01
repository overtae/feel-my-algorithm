class Solution {
    fun solution(topping: IntArray): Int {
        val size = topping.size
        
        val left = hashSetOf<Int>()
        val right = hashSetOf<Int>()
        
        val l = IntArray(size) {0}
        val r = IntArray(size) {0}
        
        
        (0 until size).map {
            left.add(topping[it])
            right.add(topping[size-it-1])
            
            l[it] = left.size
            r[size-it-1] = right.size
        }
        
        return (0 until size-1).count { l[it] == r[it+1] }
    }
}