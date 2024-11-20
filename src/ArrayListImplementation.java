import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class ListDemo {
    List list = new ArrayList();
    public  void addData(){
        list.add(JOptionPane.showInputDialog("Enter a String"));
        list.add(Integer.parseInt(JOptionPane.showInputDialog("Enter a Number")));
        list.add(456.365);
        list.add(true);
        System.out.println("list = " + list);
    }

    public void getElement(){
        ListIterator iterator = list.listIterator();
        System.out.println("List from frontside = ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();
        System.out.println("List from backside = ");
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + "\t");
        }
        System.out.println();
    }


    public void addElementAtGivenPosition(int position,Object data){
            list.add(position,data);
        System.out.println("List after adding data at specific position");
        System.out.print(list+"\t");
        System.out.println();
    }

    public void removeData(Object data){
        list.remove(data);
        System.out.println("List After removing certain data");
        System.out.print(list + "\t");
        System.out.println();
    }

    public void removeDataAtSpecificPosition(int position){
        list.remove(position);
        System.out.println("List after remove data at specific position =");
        System.out.println(list);
    }

    public void clearAll(){
        list.clear();
        System.out.println(list);
    }
    public void isContain(Object data){
        System.out.println(list.contains(data));
    }


}
public class ArrayListImplementation {
    public static void main(String[] args) {
        ListDemo obj = new ListDemo();
        obj.addData();
        obj.getElement();
        obj.addElementAtGivenPosition(1,"Java");
        obj.removeData(15);
        obj.removeDataAtSpecificPosition(2);
        obj.isContain("java");
        obj.clearAll();



    }

}
