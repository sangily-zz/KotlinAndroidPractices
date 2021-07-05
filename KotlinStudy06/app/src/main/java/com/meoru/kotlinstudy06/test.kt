class Solution {
	fun solution(bricks: IntArray, n: Int, k: Int): Int {
		var answer: Int = 0
		val w = bricks.size
		var pool:Int = 1
		var lst = IntArray(w - 2 )
		for (i in 1..(w - 2)) {
			lst.set(i, n - bricks[i])
		}
		lst.sort()
		for (i in 1..k)

		return answer
	}
}