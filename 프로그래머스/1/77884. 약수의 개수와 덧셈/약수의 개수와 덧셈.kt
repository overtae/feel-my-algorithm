class Solution {
    // 약수의 개수 구하기
    fun yaksu(n: Int): Int {
        var end = Math.sqrt(n + 0.0)
        var half = (1..end.toInt()).filter { n % it == 0 }.size
        
        return if (end%1 == 0.0) half*2 - 1 else half*2
    }
    
    
    fun solution(left: Int, right: Int): Int {
        return (left..right).fold(0) { total, n -> total + if (yaksu(n) % 2 == 0) n else -n }
    }
}