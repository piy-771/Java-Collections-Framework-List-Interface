import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Start");
        list.add(45);
        list.add("Java");
        list.addFirst("45");
        list.addLast(23);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
