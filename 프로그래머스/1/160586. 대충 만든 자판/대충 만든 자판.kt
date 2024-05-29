class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        return targets.map { target ->
            var cnt = target.map { t ->
                keymap.map { it.indexOf(t) + 1 }.filter { it != 0 }.minOrNull() ?: -1
            }
            
            if (-1 in cnt) -1 else cnt.sum()
        }.toIntArray()
    }
}