package leetCodeYandex

import java.util.*

    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (char in s) {
            if (char == '(') stack.push(')')
            else if (char == '{') stack.push('}')
            else if (char == '[') stack.push(']')
            else if (stack.isEmpty() || stack.pop() != char) return false
        }
        return stack.isEmpty();
    }

fun main() {
    println(isValid("([{{{}])"))
}