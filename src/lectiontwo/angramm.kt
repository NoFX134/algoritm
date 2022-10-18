package lectiontwo

import java.util.Collections.max
import java.util.Collections.min

fun main() {
    val first = listOf("a", "a", "b", "a")
    val graduate = listOf(1, 2, 3, 5, 5, 5, 5, 5, 5, 5, 2).toMutableList()
    val q = listOf(1,2,3,3)
    val w = listOf(5,6,3,3)
    val second = "bbcdadaaaaassss"
    val third = "adadcbbsssaaaas"
    val a = q.intersect(w)
  println(a)
}

fun <T> Collection<T>.listToStringWithNoRepeatSymbols(): String {
    return this
        .groupingBy { it }
        .eachCount()
        .filter { it.value == 1 }.keys
        .joinToString(" ")
}


fun calculateHash(word: String): Int {
    var hash = 0
    for (letters in word) {
        hash += letters.hashCode()
    }
    return hash
}


fun <T> listToMap(list: List<T>): Map<T, Int> {
    val map = hashMapOf<T, Int>()
    for (item in list) {
        map[item] = map.getOrDefault(item, 0) + 1
    }
    return map
}

fun listToMap(list: String): Map<Char, Int> {
    val map = hashMapOf<Char, Int>()
    for (number in list) {
        map[number] = map.getOrDefault(number, 0) + 1
    }
    return map
}

fun listGraduates(list: List<Int>): MutableList<Int> {
    val numbers = MutableList(6) { 0 }
    for (number in list) {
        numbers[number]++
    }
    return numbers
}

fun digitToList(number: Int): List<Int> {
    val digitArray = MutableList(10) { 0 }
    var number1 = number
    while (number1 > 0) {
        var digit = number1 % 10
        digitArray[digit]++
        number1 /= 10
    }
    return digitArray.toList()
}
