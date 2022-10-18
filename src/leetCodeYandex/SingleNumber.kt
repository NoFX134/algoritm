package leetCodeYandex

        fun singleNumber(nums: IntArray): Int {
            var result = 0;
            nums.forEach {
                result = result.xor(it)
            }
            return result;
        }

fun main(){
    println(singleNumber(intArrayOf(2,55,3,3,55,2,5)))
}