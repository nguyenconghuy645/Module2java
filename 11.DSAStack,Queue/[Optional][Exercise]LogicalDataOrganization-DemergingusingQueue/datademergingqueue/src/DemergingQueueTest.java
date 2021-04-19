import java.util.ArrayDeque;
import java.util.Queue;

public class DemergingQueueTest {

    public static void main(String[] args) {
        Queue<DemergingQueue> Female = new ArrayDeque<DemergingQueue>();
        Queue<DemergingQueue> Male = new ArrayDeque<DemergingQueue>();
        Queue<DemergingQueue> OutString = new ArrayDeque<DemergingQueue>();
        Queue<DemergingQueue> InString = new ArrayDeque<DemergingQueue>();
        DemergingQueue Fema1 = new  DemergingQueue("Hân", "Nữ");
        DemergingQueue Fema2 = new  DemergingQueue("Hằng", "Nữ");
        DemergingQueue Fema3 = new  DemergingQueue("Hạnh", "Nữ");
        DemergingQueue Male1 = new  DemergingQueue("Trung", "Nam");
        Female.add(Fema1);
        Female.add(Fema2);
        Female.add(Fema3);
        Male.add(Male1);
        OutString.add(Fema1);
        OutString.add(Fema2);
        OutString.add(Fema3);
        OutString.add(Male1);
        for (DemergingQueue item:
             OutString) {
            System.out.print(item.getGender() + "   ");
            System.out.println(item.getName());
        }
    }
}
