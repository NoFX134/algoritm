package leetCodeYandex


class IntersectionOfTwoArrays {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        if (nums2.size < nums1.size) {
            return intersect(nums2, nums1)
        }
        val map = HashMap<Int, Int>()
        val res = ArrayList<Int>()
        for (n in nums1) {
            map[n] = map.getOrDefault(n, 0) + 1
        }
        for (n in nums2) {
            if (map.contains(n) && map.getOrDefault(n, 0) > 0) {
                res.add(n)
                map[n] = map.getOrDefault(n, 0) - 1
            }
        }
        return res.toIntArray()
    }
}

fun main() {
    val list1 = intArrayOf(1,2,2,1)
    val list2 = intArrayOf(2,2)
    val list3 = list1.map{ it*it }
    println(list1.map{ it*it }.sorted().toList())

}