import java.time.LocalDate

class Solution {
    fun solution(a: Int, b: Int): String {
        return LocalDate.of(2016, a, b).dayOfWeek.toString().take(3)
    }
}