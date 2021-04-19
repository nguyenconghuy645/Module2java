import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparaTest {
    public static void main(String[] args) {
        Student student = new Student("Kiên", 30, "Hà Tĩnh");
        Student student1 = new Student("Nam", 26, "Hà Nội");
        Student student2 = new Student("Anh", 38, "Hà Tiên");
        Student student3 = new Student("Tùng", 38, "Hà Tĩnh");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);;
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getName());
            System.out.println(lists.get(i).getAge());
            System.out.println(lists.get(i).getAddress());
            System.out.println("*******************");
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sánh theo tuổi: ");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
