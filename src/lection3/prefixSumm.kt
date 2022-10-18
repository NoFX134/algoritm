package lection3

fun main() {

    val firstList = listOf(1, 0, 0, 2, 0, 7, 7, 12, 23, 1, 11)
    val zeroList = listOf(1, 0, 1, 0, 0)
    prefixSunMap(firstList)
    println(prefixSum(firstList, 2, 5))
    println(prefixSumZeroes(zeroList, 2, 5))
}

fun prefixSum(list: List<Int>, l: Int, r: Int): MutableList<Int> {
    val prefixList = mutableListOf<Int>()
    for (i in 0..list.size) {
        if (i == 0)
            prefixList.add(0)
        else
            prefixList.add(prefixList[i - 1] + list[i - 1])
    }
    return prefixList
}

fun prefixSumZeroes(list: List<Int>, l: Int, r: Int): Int {
    val prefixList = MutableList(list.size + 1) { 0 }
    for (i in 1..list.size) {
        if (list[i - 1] == 0) {
            prefixList[i] = prefixList[i - 1] + 1
        } else prefixList[i] = prefixList[i - 1]
    }
    println(prefixList)
    return prefixList[r] - prefixList[l]
}

fun prefixSunMap(list: List<Int>) {
    val prefixMap = hashMapOf(0 to 1)
    var nowSum = 0
    var count = 0
    for (element in list) {
        nowSum += element
        prefixMap[nowSum]=prefixMap.getOrDefault(nowSum, 0) + 1
        if(prefixMap.containsKey(element)){
            count++
        }

    }

    println(count)
}
