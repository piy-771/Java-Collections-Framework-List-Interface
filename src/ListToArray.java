import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add(6);
        Object[] array = list.toArray();
        for(Object i : array){
            System.out.print(i+"\t");
        }
    }
}
