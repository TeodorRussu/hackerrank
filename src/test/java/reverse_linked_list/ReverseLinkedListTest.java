package reverse_linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {

    private ReverseLinkedList reverseLinkedList;

    @BeforeEach
    void setUp() {
        reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    void reverseNullElementsList() {
        ListNode head = null;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            reverseLinkedList.reverseList(head);
        });
    }

    @Test
    void reverse1ElementsList() {
        ListNode head = new ListNode(1, null);

        ListNode newHead = reverseLinkedList.reverseList(head);

        Assertions.assertEquals(1, newHead.getId());
    }

    @Test
    void reverse2ElementsList() {
        ListNode tail = new ListNode(2, null);
        ListNode head = new ListNode(1, tail);

        ListNode newHead = reverseLinkedList.reverseList(head);

        Assertions.assertEquals(2, newHead.getId());
        Assertions.assertEquals(1, newHead.getNext().getId());
    }

    @Test
    void reverse3ElementsList() {
        ListNode tail = new ListNode(3, null);
        ListNode middle = new ListNode(2, tail);
        ListNode head = new ListNode(1, middle);


        ListNode newHead = reverseLinkedList.reverseList(head);

        Assertions.assertEquals(3, newHead.getId());
        Assertions.assertEquals(2, newHead.getNext().getId());
        Assertions.assertEquals(1, newHead.getNext().getNext().getId());
    }

    @Test
    void reverse4ElementsList() {

        ListNode tail = new ListNode(4, null);
        ListNode nodeThree = new ListNode(3, tail);
        ListNode nodeTwo = new ListNode(2, nodeThree);
        ListNode head = new ListNode(1, nodeTwo);

        ListNode newHead = reverseLinkedList.reverseList(head);

        Assertions.assertEquals(4, newHead.getId());
        Assertions.assertEquals(3, newHead.getNext().getId());
        Assertions.assertEquals(2, newHead.getNext().getNext().getId());
        Assertions.assertEquals(1, newHead.getNext().getNext().getNext().getId());
    }


}
