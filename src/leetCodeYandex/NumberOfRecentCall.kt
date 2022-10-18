package leetCodeYandex

class NumberOfRecentCall {

        var pings = listOf<Int>()
        fun ping(t: Int): Int {
            pings = pings.filter {it in (t - 3000)..t} + t
            return pings.size
        }
    }
