import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee{
    private  int employeeId;
    private  String name;
    private  double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void print(){
        System.out.println("Employee Id = "+getEmployeeId());
        System.out.println("Employee Name = " + getName());
        System.out.println("Employee Salary = " + getSalary());
    }
}

public class ProgramUsingList {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(123,"Lily",40000));
        list.add(new Employee(124,"Jiya",50000));
        list.add(new Employee(125,"Piyush",80000));


        System.out.println(list);
        Iterator i = list.iterator();
        while (i.hasNext()){
            Employee employee = (Employee) i.next();
            employee.print();
        }


    }
}
