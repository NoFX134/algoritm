package lectiontwo

fun main() {
    val set = HashSet<Runnable>()
    set.add(::something)
    set.add(::something)

    for (element in set) {
        if (filter(element)) {
            set.remove(element)
        }
        println("action")
    }

    print("something else")
}

fun something() {
    print("something")
}

fun filter(o: Any): Boolean {
    return o.toString().lowercase().contains("lambda")
}