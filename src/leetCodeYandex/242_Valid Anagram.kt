package leetCodeYandex

import java.util.*

fun isAnagram(s: String, t: String): Boolean {
    val s1= s.toCharArray()
    val s2 = t.toCharArray()
    Arrays.sort(s1)
    Arrays.sort(s2)
    return s1.contentEquals(s2)
}

fun main(){
    println(isAnagram("rat", "ayt"))
}