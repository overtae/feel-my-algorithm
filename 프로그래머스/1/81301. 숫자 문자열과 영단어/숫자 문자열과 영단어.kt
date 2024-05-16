class Solution {
    
    
    fun solution(s: String): Int {
        val words = listOf("zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var str = s
        
        words.mapIndexed { i, word -> str = str.replace(word, i.toString()) }
        
        return str.toInt()
    }
}