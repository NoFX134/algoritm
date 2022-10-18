package lectiontwo

fun main() {
    val s = "qwabqwbawq"
    println(isPalindrome(s))
}

fun isPalindrome(s: String): Boolean {
    var left = 0
    var right = s.length-1
    var ans = true
    while (left < right && ans) {
        ans = s[left] == s[right]
        left++
        right--
    }
    return ans
}
