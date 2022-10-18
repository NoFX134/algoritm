package leetCodeYandex

import lectiontwo.calculateHash

/**
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 **/
fun main(){
    val intArray1 = intArrayOf(0,0,0,1)
    val intArray2 = listOf(0,1,1,11,11,11,11,0)
    val solution2 = Solution2()
    println(solution2.moveZeroes(intArray1))

}

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        for (i in nums.indices) {
            if (nums[i] != 0) {
                changeToZeroElement(i, nums)
            }
        }
    }

    private fun changeToZeroElement(i: Int, nums: IntArray) {
        for (j in 0..i) {
            if (nums[j] == 0) {
                nums[j] = nums[i]
                nums[i] = 0
                break
            }
        }
    }
}

class Solution2 {
    fun moveZeroes(nums: IntArray): List<Int> {
        var left = 0
        var right = 0
        while (right < nums.size) {
            if (nums[right] != 0) {
                val temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
                left++
            }
            right++
        }
        return nums.toList()
    }
}