package leetCodeYandex

fun checkInclusion(s1: String, s2: String): Boolean {
    if (s1.length > s2.length) return false
    val s1map = IntArray(26)
    val s2map = IntArray(26)
    for (i in s1.indices) {
        s1map[s1[i] - 'a']++
        s2map[s2[i] - 'a']++
    }
    for (i in 0 until s2.length - s1.length) {
        if (s1map.contentEquals(s2map)) return true
        s2map[s2[i + s1.length] - 'a']++
        s2map[s2[i] - 'a']--
    }
    return s1map.contentEquals(s2map)
}



fun main() {
    println(checkInclusion("asd", "sdfddsgkdsfdsalkflg"))
}