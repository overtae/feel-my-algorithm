class Solution {
    fun solution(answers: IntArray): IntArray {
        val supoja = arrayOf(intArrayOf(1, 2, 3, 4, 5),
                  intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
                  intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5))
        val score = intArrayOf(0, 0, 0)
        var answer = IntArray(0)
        
        answers.mapIndexed { i, answer -> 
            (0..2).map {
                if (supoja[it][i%supoja[it].size] == answer) score[it] += 1
            }
        }
        
        score.mapIndexed { i, s -> if (s == score.maxOrNull()) answer += i + 1 }
        
        return answer
    }
}