package `1stlesson`

fun main() {
    val exampleNumber = readLine().toString()
    val firstNumber = readLine().toString()
    val secondNumber = readLine().toString()
    val thirdNumber = readLine().toString()

    println(equals(exampleNumber, firstNumber))
    println(equals(exampleNumber, secondNumber))
    println(equals(exampleNumber, thirdNumber))
}

fun equals(exampleNumber: String, firstNumber: String): String {
    return if(correctNumber(firstNumber)==correctNumber(exampleNumber)) "YES" else "NO"

}

fun correctNumber(number: String): String {
    var newNumber = number
        .replace("(", "")
        .replace(")", "")
        .replace("-", "")
        .replace("+7", "8")
    if (newNumber.length == 7) {
        return "8495$newNumber"
    }
    return newNumber
}


