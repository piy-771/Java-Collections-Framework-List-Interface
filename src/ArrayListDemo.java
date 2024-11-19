import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list.size());
        list.add(10);
        list.add("Piyush");
        list.add(4.25);
        System.out.println(list);
    }
}
