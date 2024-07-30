class Solution {
    fun Int.isPrime() = this > 1 && (2..this/2).all { this % it != 0 }
    
    fun solution(numbers: String): Int {
        val numSet = HashSet<Int>()
        val visited = Array(7) { false }
        
        fun find(s: String = "", c: Int = 0) {
            if (c > numbers.length) return
            numbers.indices.map { i -> 
                if (!visited[i]) {
                    val new = s + numbers[i]
                    numSet.add(new.toInt())
                    
                    visited[i] =  true
                    find(new, c + 1)
                    visited[i] = false
                }
            }
        }
        find()

        return numSet.count { it.isPrime() }
    }
}