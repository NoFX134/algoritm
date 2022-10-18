package linearSearch

import java.lang.Integer.max
import java.lang.Integer.min


fun main() {
    val list = listOf(1, 28, 30, 22, 20, 3, 7, 9, -2, 2, 29, 7, 6, 21, 3, 20,)
    val x = 5
    val ans = findMinEven(list)
    var ans1 = list.joinToString(separator = " ")
    val ans2 = findMaxAndNextMax(list)
    println(ans2.toTestString())
}

fun findX(list: List<Int>, x: Int): Int {
    var ans = -1
    for (i in list.indices) {
        if (list[i] == x) {
            ans = i
        }
    }
    return ans
}

fun findMax(list: List<Int>): Pair<Int, Int> {
    var ans = list[0]
    var ansIndex = 0
    for (i in list.indices) {
        if (ans < list[i]) {
            ans = list[i]
            ansIndex = i
        }
    }
    return Pair(ans, ansIndex)
}

fun findMin(list: List<Int>): Int {
    var ans = 0
    for (i in list.indices) {
        if (list[ans] > list[i]) {
            ans = i
        }
    }
    return list[ans]
}

fun findMaxAndNextMax(list: List<Int>): Pair<Int, Int> {
    var max1 = max(list[0], list[1])
    var max2 = min(list[0], list[1])
    for (i in 2 until list.size) {
        if (list[i] > max1) {
            max2 = max1
            max1 = list[i]
        } else if (list[i] > max2) {
            max2 = list[i]
        }
    }
    return Pair(max1, max2)
}

fun findMinEven(list: List<Int>): Int {
    var ans = -1
    var flag = false
    for (i in list.indices) {
        if (list[i]%2==0&&!flag||list[i]<ans) {
            ans = list[i]
            flag=true
        }
    }
    return ans
}

