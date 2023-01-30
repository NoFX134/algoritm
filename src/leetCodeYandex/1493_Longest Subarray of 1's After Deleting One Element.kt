package leetCodeYandex

fun longestSubarray(A: IntArray): Int {
    var i = 0
    var k = 1
    var j= 0
    while (j < A.size) {
        if (A[j] == 0) k--
        if (k < 0 && A[i++] == 0) k++
        ++j
    }
    return j - i - 1
}

fun main(){
    println(longestSubarray(intArrayOf(0,1,1,1,0,1,1,0,1)))
}