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
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + "\t");
        }
    }


    public void addElementAtGivenPosition(int position,Object data){
            list.add(position,data);
        System.out.print(list+"\t");
    }


}
public class ArrayListImplementation {
    public static void main(String[] args) {
        ListDemo obj = new ListDemo();
        obj.addData();
        obj.getElement();
        obj.addElementAtGivenPosition(1,"Java");


    }

}
