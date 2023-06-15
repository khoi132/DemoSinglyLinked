import java.sql.SQLOutput;

public class MyList {
    // coi nhu la 1 doan tau, gomcac toa tau, toa dau, toa cuoi
    Node head, tail;

    // contructor
    public MyList(){
        head = tail = null;
    }
// phuong thuc kiem tra xem co rong hay khong
    public boolean isEmpty(){
        return head ==null;
    }
    //them mot phan tu vao danh sach lien ket
    public void add(int x){
        // Khoi tao 1 phan tu
        Node q = new Node(x);
        if(isEmpty()){
            head = tail = q;

        }
        else{
            // lay moc duoi moc vao node moi
            // gan duoi  = node moi
            tail.next = q;
            tail = q;

        }



    }
    // them 1 mang vao danh sach
    public  void addMany(int[] a){
        // Duyet lan luot cac phantu trong mang a va them tung phan tu
        for(int i:a){
            add(i);
        }
    }
    public void traverse(){
        // dung 1 node lam con tro va tro tu head den null
        Node currentNode = head;
        while(currentNode !=null){
            System.out.println(currentNode.info);
            currentNode = currentNode.next;
        }
    }

}
