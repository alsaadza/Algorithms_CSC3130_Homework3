public class DLLNode {
    Song data;
    DLLNode next;
    DLLNode prev;

    public DLLNode(Song data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
