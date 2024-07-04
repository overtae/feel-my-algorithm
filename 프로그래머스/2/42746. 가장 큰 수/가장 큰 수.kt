class Solution {
    fun solution(numbers: IntArray): String {
        val comparator = Comparator<String> { a, b ->
            val formatedA = a.repeat(6).substring(0, 6)
            val formatedB = b.repeat(6).substring(0, 6)
            
            when {
                formatedA > formatedB -> -1
                formatedA < formatedB -> 1
                else -> 0
            }
        }
        
        return if (numbers.all { it == 0 }) "0" else numbers.map(Int::toString).sortedWith(comparator).joinToString("")
    }
}