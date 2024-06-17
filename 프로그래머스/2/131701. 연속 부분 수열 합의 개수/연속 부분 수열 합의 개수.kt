class Solution {
    fun solution(elements: IntArray): Int {
        val size = elements.size
        return (1..size).flatMap { s ->
            elements.indices.map { 
                (it until it+s).fold(0) { total, i ->
                    total + elements[i%size]
                }
            }
        }.toSet().size
    }
}