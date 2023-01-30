package leetCodeYandex

fun twoSum(nums: IntArray, target: Int):  IntArray {
    val hash = HashMap<Int, Int>()
    for (i in nums.indices){
        if (hash.containsKey(target-nums[i])){
            return intArrayOf(hash.getOrDefault(target-nums[i],0), i)
        }
        else hash[nums[i]] = i
    }
    return intArrayOf()
}

fun main(){
val ans = twoSum(intArrayOf(2,0,23,3,6,8), 10)
println(ans.toList())

}