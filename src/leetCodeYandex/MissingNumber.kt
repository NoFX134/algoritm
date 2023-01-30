package leetCodeYandex

class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        var ans = 0
        var i = 0
        while (i < nums.size) {
            ans = ans xor i xor nums[i]
            i++
        }
        return ans xor i
    }
}

fun missingNumber(nums: IntArray): Int {
    var sum = nums.size
    for (i in nums.indices) {
        sum =sum+(i-nums[i])
    }
    return sum
}
fun main() {
    println(missingNumber(intArrayOf(0,2,3,4,5)))
}