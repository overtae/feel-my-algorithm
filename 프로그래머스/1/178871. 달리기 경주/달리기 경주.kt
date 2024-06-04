class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var p = players.indices.associateBy { players[it] }.toMutableMap()
        
        callings.map { name ->
            var originRank = p[name]!!
            var frontName = players[originRank - 1]
            
            players[originRank] = frontName
            players[originRank - 1] = name
            
            p[name] = originRank - 1
            p[frontName] = originRank
        }
        
        return players
    }
}