// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // khoi tao 1 danh sach va them cac phan tu
        MyList ml = new MyList();
        ml.add(1);
        ml.add(43);
        ml.add(5);
        ml.add(8);
        int[] a = {2, 6, 7, 9};
        ml.addMany(a);
        ml.traverse();
    }
}