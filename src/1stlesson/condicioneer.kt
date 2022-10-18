package `1stlesson`

fun main() {
    val temperatures = readLine()?.split(" ")
    val mode = readLine()
    val result = workProgramm(temperatures, mode)
    println(result)
}

fun workProgramm(temperatures: List<String>?, mode: String?): Int {
    val tRoom = temperatures?.get(0)?.toInt()
    val tCond = temperatures?.get(1)?.toInt()
    return if ((tRoom != null) && (tCond != null)) {
        when (mode) {
            "heat" -> heatRoom(tRoom, tCond)
            "freeze" -> freezeRoom(tRoom, tCond)
            "auto" -> tCond
            "fun" -> tRoom
            else -> 0
        }
    }
    else 0
}

fun freezeRoom(tRoom: Int, tCond: Int): Int {
    return if (tCond < tRoom) tCond else tRoom
}

fun heatRoom(tRoom: Int, tCond: Int): Int {
    return if (tCond > tRoom) tCond else tRoom
}
