class Solution {
    fun solution(nums: IntArray): Int {
        val l = nums.size - 1
        val sumOfNums = (0..l-2).flatMap { i ->
            (i+1..l-1).flatMap { j ->
                (j+1..l).filter { k -> 
                    var n = nums[i] + nums[j] + nums[k]
                    (1..n/2).count { n % it == 0 } == 1
                }
            }
        }

        return sumOfNums.size
    }
}