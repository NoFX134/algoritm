package lection

fun main() {
    val list = emptyList<Int>()
    println(maxSequence(list))
}

fun maxSequence(list: List<Int>): Int {
    var count = 0
    var answ = 0
    val ans = mutableListOf<Int>()
    for (i in list.indices) {
        if (list[i] == 1) {
            count++
            if (count > answ) {
                answ = count
            }
        } else count = 0

    }
    return answ //ans.sorted()[ans.size-1]
}


