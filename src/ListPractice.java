import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of list");
        int n = scanner.nextInt();
        List list = new ArrayList<>();
        System.out.println("Enter "+ n + " elements");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("Enter number of query");
        int q = scanner.nextInt();
        scanner.nextLine();
        while (q--> 0) {
            System.out.println("Enter query");
            String s = scanner.nextLine();

            if(s.equals("Insert")){
                list.add(scanner.nextInt(),scanner.nextInt());
                scanner.nextLine();
            }else if(s.equals("Delete")){

                list.remove(scanner.nextInt());
                scanner.nextLine();
            }

        }
        System.out.println(list);
    }
}
