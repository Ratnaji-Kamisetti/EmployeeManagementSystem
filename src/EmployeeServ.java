import java.util.HashSet;
import java.util.Scanner;

public class EmployeeServ {
    Scanner sc = new Scanner(System.in);
    boolean found = false;
    HashSet<Employee> empSet = new HashSet<>();

    Employee emp1 = new Employee(101, "Andrew", "Development", 10000.00);
    Employee emp2 = new Employee(102, "Jenny", "Testing", 5000.00);

    int empId;
    String name;
    String department;
    double salary;

    public EmployeeServ() {
        empSet.add(emp1);
        empSet.add(emp2);
    }


    public void getAllEmp() {
        for (Employee emp : empSet) {
            System.out.println(emp);
        }
    }

    public void getEmpById() {
        System.out.print("Enter Employee Id: ");
        int id = sc.nextInt();
        for (Employee emp : empSet) {
            if (emp.getEmpId() == id) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found){
            System.out.println("Employee not found");
        }
    }

    public void getUpdateEmpl() {
        System.out.print("Enter Emp id: ");
        int id = sc.nextInt();
        found = false;
        for (Employee emp : empSet) {
            if (emp.getEmpId() == id) {
                System.out.print("Enter name: ");
                name = sc.next();
                System.out.println("Enter new salary: ");
                salary = sc.nextDouble();
                emp.setName(name);
                emp.setSalary(salary);
                System.out.println("Updated employee details");
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not found");
        }
        else {
            System.out.println("Employee details updated successfully!!");
        }
    }
    public void deleteEmp() {
        System.out.println("Enter id to delete: ");
        int id = sc.nextInt();
        boolean found = false;
        Employee empdelete = null;
        for (Employee emp : empSet) {
            if (emp.getEmpId() == id) {
                empdelete = emp;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not found");
        }
        else {
            empSet.remove(empdelete);
            System.out.println("Employee deleted successfully!!");
        }
    }

    public void addEmp() {

        System.out.print("Enter Empid: ");
        int id = sc.nextInt();
        boolean found = false;
        //for (Employee emp1 : empSet) {
        //  if (emp1.getEmpId() == id) {
                empId = id;
                System.out.print("Enter name: ");
                name = sc.next();
                System.out.print("Enter department: ");
                department = sc.next();
                System.out.print("Enter salary: ");
                salary = sc.nextDouble();
                found = true;
                Employee emp = new Employee(id, name, department, salary);
                empSet.add(emp);
                System.out.println("Employee added successfully!!");
                System.out.println(emp);
          //  }
        //}

    }
}
