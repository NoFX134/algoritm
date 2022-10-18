package leetCodeYandex

class ReverseLinkedList {
    fun reverseList(head: ListNode?): ListNode? {
        var reversed: ListNode? = null

        var current = head
        while (current != null) {
            reversed = ListNode(current.`val`).apply { next = reversed }
            current = current.next
        }

        return reversed
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

