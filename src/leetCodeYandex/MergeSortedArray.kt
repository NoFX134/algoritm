package leetCodeYandex

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {
    var first = m - 1
    var second = n-1
    var merge = m+n-1
    while(second>=0){
        if(first >=0 && nums1[first] > nums2[second]){
            nums1[merge--] = nums1[first--];
        }
        else{
            nums1[merge--] = nums2[second--];
        }
    }
    return nums1
}
fun numJewelsInStones(J: String, S: String): Int {
    val cnt = IntArray(128)
    for (c in S.toCharArray()) {
        cnt[c.code]++
    }
    var ans = 0
    for (c in J.toCharArray()) {
        ans += cnt[c.code]
    }
    return ans
}

fun main(){
   println(numJewelsInStones("aA","aAAAzzza"))
}
