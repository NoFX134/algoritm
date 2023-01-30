package leetCodeYandex

fun compress(chars: CharArray): String {
    val string = StringBuilder()
    var count = 1
    for (i in 0..chars.size - 2) {
        if (chars[i] == chars[i + 1]) {
            count++
        } else {
            string.append(chars[i])
            if (count != 1) {
                string.append(count)
            }
            count=1
        }
    }
    return string.toString()
}

fun main(){
    println(compress("aaaabbbbcdddhhh".toCharArray()))
}
