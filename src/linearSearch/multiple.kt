package linearSearch

import kotlin.math.min

fun main() {
    val x= 8
    val list1 = listOf(5, 3, 3, 2, 5, 7)
    var ans = Pair(0,0)
    val set =  mutableSetOf<Int>()
    for (number in list1) {
        if (set.contains(x - number)) {
        ans = Pair(x-number, number )
        }
        set.add(number)
    }
    println("${ans.first} ${ans.second}")
}

fun on2(list1: List<Int>, x: Int): Pair<Int, Int> {
    var a = 0
    var b = 0
    for (i in list1.indices) {
        for (j in i + 1 until list1.size) {
            if (list1[i] + list1[j] == x && a == 0 && b == 0) {
                a = list1[i]
                b = list1[j]
            }
        }
    }
    return Pair(a, b)
}