// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {

        MyStack ms = new MyStack(5);
        ms.push(new Node(2));
        ms.push(new Node(4));
        ms.push(new Node(6));
        ms.push(new Node(8));
        ms.push(new Node(10));

        System.out.println("Ngăn xếp ban đầu");
        ms.print();
        System.out.println("Ngăn xếp khi push thêm");
        ms.push(new Node(12));
        System.out.println("phần tử trên cùng ngăn xếp là");
        Node x = ms.topEl();
        x.printInfo();


        System.out.println("Ngăn xếp sau khi lấy ra 1 phần tử");
        Node y = ms.pop();
        ms.print();

        System.out.println("phần tử lấy ra là: ");
        y.printInfo();
    }
        public static void decToBin(int k){
            MyStack s = new MyStack(10);
            int top = -1;
            while (k>0) {
                int m = k%2;
                s.push(new Node(m));
                k = k / 2;
            }
            System.out.println("Binary");
            while (!s.isEmpty()) {
                Node node = s.pop();
                node.printInfo();

            }
        }
}


