class Solution {
    fun solution(book_time: Array<Array<String>>): Int {
        // *풀이를 하려면...
        //  체크인 시간과 체크아웃 시간은 최소 10분 차이
        //  첫번째 손님의 체크아웃 시간과 두번째 손님의 체크인 시간 차이가 최소일 때, 최소 방 개수를 구할 수 있다.
        
        // 체크인 시간 기준 오름 차순 정렬 후 숫자 형식으로 변환
        val times = book_time.sortedBy { it[0] }.map { it.map { time -> time.split(":").map(String::toInt) } }
        val booked = BooleanArray(book_time.size) { false }
        var answer: Int = 0
        
        repeat(book_time.size) {
            if (!booked[it]) {
                // 예약을 하지 않았다면,
                // 이전에 할 수 있던 예약이 없던 것.
                // + 이후에 할 수 있는 예약 카운트 
                // (체크인 시간이 현재 손님의 체크아웃 시간보다 10분 뒤에 있어야 함)
                
                // hour * 60 + minute
                var checkout = times[it][1][0]*60 + times[it][1][1] + 10
                booked[it] = true
                answer++
                (it until book_time.size).forEach { index -> 
                    val checkin = times[index][0][0]*60 + times[index][0][1]
                    if (!booked[index] && checkout <= checkin) {
                        checkout = times[index][1][0]*60 + times[index][1][1] + 10
                        booked[index] = true
                    }
                }
            }
        }
        
        
        return answer
    }
}