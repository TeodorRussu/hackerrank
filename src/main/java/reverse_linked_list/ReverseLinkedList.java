package reverse_linked_list;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            throw new IllegalArgumentException("The input is null");
        ListNode newHead = head;
        ListNode oldHead = head.getNext();
        newHead.setNext(null);

        while (oldHead != null) {
            ListNode nextHead = oldHead.getNext();
            oldHead.setNext(newHead);
            newHead = oldHead;
            oldHead = nextHead;
        }

        return newHead;
    }
}
