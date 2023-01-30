package leetCodeYandex

fun firstUniqChar(s: String): Int {
    val charArray = IntArray(256)
    for (element in s) {
        charArray[element.code]++
    }
    for (i in s.indices) {
        if (charArray[s[i].code] == 1) return i
    }
    return -1
}

fun main(){
    firstUniqChar("qqwwertyy")
    println()
}