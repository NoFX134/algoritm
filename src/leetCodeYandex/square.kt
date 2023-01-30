package leetCodeYandex

import kotlin.math.abs

class Square {
    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var start = 0
        var end = nums.size - 1

        for (i in nums.size - 1 downTo 0) {
            if (abs(nums[start]) > abs(nums[end])) {
                result[i] = nums[start] * nums[start]
                start++
            } else {
                result[i] = nums[end] * nums[end]
                end--
            }
        }

        return result
    }
}
fun main(){
    val lis = intArrayOf(-4,-3,0,5,10)
    println(Square().sortedSquares(lis).toList())
}