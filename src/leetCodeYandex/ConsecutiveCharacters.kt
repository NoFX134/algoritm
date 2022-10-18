package leetCodeYandex

import kotlin.math.max

fun maxPower(s: String): Int? {
    var power = 1
    var maxPower = 0
    if (s.length==1)  return 1
    for (i in 0..s.length - 2) {
        if (s[i] == s[i + 1]) {
            power++
        } else {
            power = 1
        }
        maxPower = max(power, maxPower)
    }
    return maxPower
}

fun main() {
    val ans = maxPower("c")
    println(ans)
}