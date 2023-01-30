package leetCodeYandex

import kotlin.math.max
import kotlin.math.min

    fun isReflected(points: Array<IntArray>): Boolean {
        var minX = Int.MAX_VALUE
        var maxX = Int.MIN_VALUE
        val set = HashSet<String>()
        for (point in points) {
            minX = min(minX, point[0])
            maxX = max(maxX, point[0])
            set.add(point[0].toString() + " " + point[1])
        }
        val sum = (minX + maxX)
        for (point in points) {
            if (!set.contains((sum - point[0]).toString() + " " + point[1])) return false
        }
        return true
    }

fun main(){
    println(isReflected(arrayOf(intArrayOf(-1,1), intArrayOf(1,1),intArrayOf(2,1),intArrayOf(-2,2) )))
}