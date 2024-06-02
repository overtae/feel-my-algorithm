class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        // (minY, minX, maxY, maxX)
        var answer = intArrayOf(50, 50, 1, 1)
        
        wallpaper.mapIndexed { i, wall ->
            if (wall.contains("#")) {
                if (answer[1] > wall.indexOf("#")) answer[1] = wall.indexOf("#")
                if (answer[3] < wall.lastIndexOf("#") + 1) answer[3] = wall.lastIndexOf("#") + 1
                if (answer[0] > i) answer[0] = i
                if (answer[2] < i + 1) answer[2] = i + 1
            }
        }
        
        return answer
    }
}