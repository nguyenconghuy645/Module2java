public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Hạnh");
        myList.add("Bích");
        myList.add("Hân");
        myList.add("Hằng");
        myList.add("My");
        myList.add("Mai");
        myList.add("Nô");
        myList.add("Trung");
        myList.add("Anh");

        print(myList.getData());
        System.out.println(myList.indexOf("Hạnh"));
        System.out.println(myList.indexOf("Bích"));
        myList.remove(1);
        myList.add("Huy", 1);
        print(myList.getData());
        MyList<String> clone = myList.clone();
        System.out.println(clone.contains("Hằng"));
        System.out.println(clone.contains("My"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());
    }

    static void print(Object[] myList) {
        for (Object x : myList) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}
