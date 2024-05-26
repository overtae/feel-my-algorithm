class Solution {
    fun solution(babbling: Array<String>): Int {
        val pronounce = arrayOf("aya", "ye", "woo", "ma")

        return babbling.count { word ->
            var result = word
            
            pronounce.map { result = result.replace(it, " ") }
            pronounce.none { word.contains(it.repeat(2)) } && result.isNullOrBlank()
        }
    }
}