class Solution {
    fun solution(phone_number: String): String {
        var len = phone_number.length
        
        return "*".repeat(len-4) + phone_number.substring(len-4, len)
    }
}