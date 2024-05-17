class Solution {
  fun solution(a: Int, b: Int, n: Int): Int {
    var answer: Int = 0
    var bottles = n

    while (bottles >= a) {
	    answer += bottles/a * b
      bottles = bottles/a*b + bottles%a
    }

    return answer
  }
}