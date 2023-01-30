package leetCodeYandex

fun reverseWords(s: String): String {
    val ans = mutableListOf<Char>()
    val temp = mutableListOf<Char>()
    for (i in s.length - 1 downTo 0) {
        if (s[i] != ' ') {
            temp.add(s[i])
        } else {
            temp.add(0, ' ')
            ans.addAll(0, temp)
            temp.clear()
        }
    }
    ans.addAll(0, temp)
    return ans.joinToString("")
}

fun reverseWord(s: String): String? {
    val s1 = s.toCharArray()
    var i = 0
    for (j in s1.indices) {
        if (s1[j] == ' ') {
            reverse(s1, i, j - 1)
            i = j + 1
        }
    }
    reverse(s1, i, s1.size - 1)
    return String(s1)
}

fun reverse(s: CharArray, l: Int, r: Int) {
    var l = l
    var r = r
    while (l < r) {
        val temp = s[l]
        s[l] = s[r]
        s[r] = temp
        l++
        r--
    }
}


fun main() {
    println(reverseWords("qw op"))
}

