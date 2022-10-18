package linearSearch

fun main() {
    val list = listOf(3, 1, 4, 3, 5, 1, 1, 3)

    val ans = findWater(list)
    println(ans)
}

fun findWater(list: List<Int>): Any {
    var maxPos = 0
    for (i in list.indices) {
        if (list[i] > list[maxPos])
            maxPos = i
    }
    var ans = 0
    var nowMax = 0
    for (i in 0..maxPos) {
        if (list[i] > nowMax) {
            nowMax = list[i]
        }
        ans += nowMax - list[i]
    }

    nowMax = 0
    for (i in list.size - 1 downTo maxPos ) {
        if (list[i] > nowMax) {
            nowMax = list[i]
        }
        ans += nowMax - list[i]
    }
    return ans
}