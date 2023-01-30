package leetCodeYandex

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) {
        return 0
    }
    var i = 0
    for (j in 1 until nums.size) {
        if (nums[j] != nums[i]) {
            i++
            nums[i] = nums[j]
        }
    }
    return i + 1
}

fun main() {
    removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4))
}