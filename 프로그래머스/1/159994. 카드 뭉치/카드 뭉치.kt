class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var (c1, c2) = Pair(cards1, cards2)
        for (word in goal) {
            if (!c1.isEmpty() && c1[0] == word) c1 = c1.drop(1).toTypedArray()
            else if (!c2.isEmpty() && c2[0] == word) c2 = c2.drop(1).toTypedArray()
            else return "No"
        }
               
        return "Yes"
    }
}