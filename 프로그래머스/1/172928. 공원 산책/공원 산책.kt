class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        // N: (-1, 0) S: (+1, 0)
        // W: (0, -1) E: (0, +1)
        // var parkArr = Array(park.size, { i -> park[i].toCharArray() })
        var (x, y) = Pair(0, 0)
        var pMap = (0..park.size-1).flatMap { i ->
            (0..park[0].length-1).map { j ->
                if (park[i][j] == 'S') {
                    x = i
                    y = j
                }
                Pair("$i $j", park[i][j])
            }
        }.associate { it.first to it.second }
        
        routes.map {
            var (op, n) = it.split(" ")
            var (moveX, moveY) = Pair(x, y)
            var isReset = false
            
            for (i in 1..n.toInt()) {
                when (op) {
                    "N" -> moveX -= 1
                    "S" -> moveX += 1
                    "W" -> moveY -= 1
                    else -> moveY += 1
                }
                
                if (!pMap.containsKey("$moveX $moveY") || pMap["$moveX $moveY"] == 'X') {
                    isReset = true
                    break
                }
            }
            
            if (!isReset) {
                x = moveX
                y = moveY
            }
        }
        
        return intArrayOf(x, y)
    }
}