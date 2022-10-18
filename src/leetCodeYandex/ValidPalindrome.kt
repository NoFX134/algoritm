package leetCodeYandex

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        var ans = (s.trim().isEmpty() || s.length == 1)
        while (left < right) {
            if (!s[left].isLetterOrDigit()) left++
            else if (!s[right].isLetterOrDigit()) right++
            else {
                if (s[left].toLowerCase()!=s[right].toLowerCase()) {
                    return false
                }
                left++
                right--
            }
        }
        return true
    }
}

fun main() {
    val a = ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama")
    println(a)
}
