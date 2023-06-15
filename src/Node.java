public class Node {
    // Coi nhu 1 toa tau chi gom cos info va next
    int info;
    Node next;
    //contructor
    public Node(int info, Node next){
        this.info = info;
        this.next = next;
    }
    public Node(int info){
        this.info = info;
        this.next = null;
    }

}
