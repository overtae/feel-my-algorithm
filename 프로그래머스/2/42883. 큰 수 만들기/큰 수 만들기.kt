class Solution {
    fun solution(number: String, k: Int): String {
        var answer = StringBuilder()
        var from = 0
        
        // number 뒤에서 k 만큼의 길이를 남겨두고, 최댓값을 구한다.
        // (0 until number.length-k).map { i ->
        //     var max = '0'
        //     (from..i+k).map { j ->
        //         if (max < number[j]) {
        //             max = number[j]
        //             from = j + 1
        //         }
        //     }
        //     answer.append(max) 
        // }
        
        for(i in 0 until number.length - k){
            var max = '0'
            for(j in from..i + k){
                if(max < number[j]){
                    max = number[j]
                    from = j+1
                }
            }
            answer.append(max)
        }

        return answer.toString()
    }
}