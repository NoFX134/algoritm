package linearSearch

fun main() {
    val string = "ABBCCCDDDDXCVBBB"
    val ans: String = toRLEString(string)
    println(ans)
}

fun toRLEString(string: String): String {
    var firstSymbol = string[0]
    val ans: StringBuilder = StringBuilder("")
    var count = 1
    for (i in 1 until string.length) {
        if (string[i] == firstSymbol)
            count++
        else {
            ans.append(firstSymbol)
            if (count > 1) {
                ans.append(count)
            }
            count = 1
            firstSymbol = string[i]
        }
    }
    ans.append(firstSymbol)
    ans.append(count)

    return ans.toString()
}