import java.util.ArrayList;

public class Product {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        ProductManager productManager = new ProductManager("Áo", 1, "Không size");
        ProductManager productManager1 = new ProductManager("Quần", 2, "size XX");

        arrayList.add(productManager);
        arrayList.add(productManager1);
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        arrayList.remove(0);
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.indexOf(productManager));
    }
}
