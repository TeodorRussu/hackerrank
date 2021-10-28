package reverse_linked_list;

public class ListNode {
    int id;
    ListNode next;

    public ListNode(int id, ListNode next) {
        this.id = id;
        this.next = next;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
