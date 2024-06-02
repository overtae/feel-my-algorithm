class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        // RT CF JM AN
        
        var t = choices.foldIndexed("") { i, t, c ->
            if (c < 4) t + "${survey[i][0]}".repeat(4-c)
            else if (c > 4) t + "${survey[i][1]}".repeat(c-4)
            else t            
        }
        
        var answer: String = ""
        
        answer += if (t.count {it == 'R'} >= t.count {it == 'T'}) "R" else "T"
        answer += if (t.count {it == 'C'} >= t.count {it == 'F'}) "C" else "F"
        answer += if (t.count {it == 'J'} >= t.count {it == 'M'}) "J" else "M"
        answer += if (t.count {it == 'A'} >= t.count {it == 'N'}) "A" else "N"
        
        return answer
    }
}