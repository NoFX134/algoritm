package leetCodeYandex

fun maxDistToClosest(seats: IntArray): Int {
    var max = 0
    var lastPerson = -1
    for (i in seats.indices) {
        if (seats[i] == 1) {
            if (lastPerson == -1) {
                max = maxOf(max, i)
            } else {
                max = maxOf(max , (i - lastPerson) / 2)
            }
            lastPerson = i
        }
    }
    max = maxOf(max, (seats.lastIndex - lastPerson))
    return max
}

fun main() {
    maxDistToClosest(intArrayOf(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1))
}