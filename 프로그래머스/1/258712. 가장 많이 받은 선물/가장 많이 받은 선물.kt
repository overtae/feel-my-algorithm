class Solution {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        val hm = hashMapOf<String, Int>()
        val giftsMap = gifts.map { it.split(" ") }.groupBy({ it.first() }, { it.last() })
        val giftsScore = friends.map { f -> f to giftsMap.getOrDefault(f, listOf()).size - gifts.count { it.split(" ")[1] == f } }.toMap()
        
        // friends를 순회하며 a를 기준으로 비교
        friends.forEach { a ->
            friends.forEach { b ->
                val fromA = giftsMap.getOrDefault(a, listOf()).count { it == b }
                val fromB = giftsMap.getOrDefault(b, listOf()).count { it == a }
                
                // A가 B에게 준 선물이 더 많다면,
                if (fromA > fromB) {
                    hm[a] = hm.getOrDefault(a, 0) + 1
                // A와 B가 서로 주고 받은 선물의 수가 같고,
                // A의 선물 지수가 B보다 크다면,
                } else if (fromA == fromB && giftsScore.getOrDefault(a, 0) > giftsScore.getOrDefault(b, 0)) {
                    hm[a] = hm.getOrDefault(a, 0) + 1
                }
            }
        }
        
        return hm.values.maxOrNull() ?: 0
    }
}
