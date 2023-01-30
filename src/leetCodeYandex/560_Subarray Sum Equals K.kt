package leetCodeYandex

    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        var pastTotals = mutableMapOf<Int, Int>(0 to 1)
        var total = 0
       for (num in nums) {
            total += num
            count += pastTotals.getOrDefault(total-k, 0)
           pastTotals[total] = pastTotals.getOrDefault(total, 0)+1
        }
        return count
    }

fun main(){
  println(subarraySum(intArrayOf(1,3,2,2,4),4))
}