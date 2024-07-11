class Solution {
    fun solution(n: Int): IntArray {
        // 삼각형 모양의 배열 0으로 초기화
        var answer = Array(n) { i -> Array(i+1) {0} }
        
        // x: 행, y: 열
        // 처음에 어차피 행을 늘릴 거라 -1부터 시작
        var (x, y) = -1 to 0
        
        // 채울 숫자
        var cnt = 1
        
        // i 번째 변
        (0 until n).map { i ->
            // 채워야 할 칸의 개수
            // (아래, 오른쪽, 위) 방향 반복
            // ( 0,    1,    2): i를 3으로 나눈 나머지
            (i until n).map { j ->
                when (i%3) {
                    0 -> x++
                    1 -> y++
                    else -> (x--).also { y-- }
                }
                answer[x][y] = cnt++
            }
        }
        
        return answer.flatten().toIntArray()
    }
}