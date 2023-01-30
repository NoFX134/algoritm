package leetCodeYandex

fun isSubsequence(s: String, t: String): Boolean {
    var sPointer = 0
    var tPointer = 0
    var ans = false
    if (s.isEmpty()) return true
    if (s.length==t.length) return s==t
    while (sPointer < s.length&&tPointer<t.length) {
        if (s[sPointer] != t[tPointer]) {
            tPointer++
            ans = false
        } else {
            ans = true
            sPointer++
            tPointer ++
        }
    }
    if (sPointer < s.length) return false
    return ans
}

fun main() {
    println(isSubsequence("acb", "ahbgdcb"))
}