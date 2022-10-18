package leetCodeYandex

class SummaryRanges {
    fun summaryRanges(nums: IntArray): List<Any> {
        var left = 0
        var right = 0
        val ranges = mutableListOf<String>()
        while (right < nums.size) {
            if (right < nums.size - 1 && nums[right + 1] == nums[right] + 1) {
                right++

            } else {
                ranges.add(
                    if (left == right) "${nums[left]}" else "${nums[left]}->${nums[right]}"
                )
                right++
                left = right
            }
        }

        return ranges
    }
}

fun main() {
    val ans = SummaryRanges().summaryRanges(intArrayOf(0, 2, 3, 4, 6, 8, 9, 10, 78))
    println(ans)
}