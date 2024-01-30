import java.util.Scanner;

public class Main {

    static boolean ordering = true;
    public static void menu() {
        System.out.println("**********Menu***********"
                + "\n1.View All Employee"
                + "\n2.View Employee By ID"
                + "\n3.Update Employee"
                + "\n4.Delete Employee"
                + "\n5.Add Employee"
                + "\n6.Exit");
    }

    public static void main(String[] args) {

        EmployeeServ empserv = new EmployeeServ();
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            System.out.print("Enter your choice: ");
            int choice  = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("View All Employee");
                    empserv.getAllEmp();
                    break;
                case 2:
                    System.out.println("Employee by ID");
                    empserv.getEmpById();
                    break;
                case 3:
                    System.out.println("Updated Employee");
                    empserv.getUpdateEmpl();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    empserv.deleteEmp();
                    break;
                case 5:
                    System.out.println("Add Employee");
                    empserv.addEmp();
                    break;
                case 6:
                    System.out.println("Thanks for the using Application");
                    System.exit(0);
            }
        } while (ordering);
    }
}