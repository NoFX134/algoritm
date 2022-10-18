package `1stlesson`

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val list = listOf(a, b, c).sorted()
    val ans = if (list[0] + list[1] > list[2]) "YES" else "NO"
    println(ans)
}