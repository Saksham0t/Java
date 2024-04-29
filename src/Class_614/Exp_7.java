package Class_614;
import java.io.*;
import java.util.*;
class Employee {
    int id;
    String name;
    int age;
    double salary;
    Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void display() {
        System.out.println(id + " " + name + " " + age + " " + salary);
    }
}
class EmployeeManagementSystem {
    List<Employee> employees = new ArrayList<>();
    File file = new File("employees.txt");
    void addEmployee(int id, String name, int age, double salary) throws IOException {
        Employee emp = new Employee(id, name, age, salary);
        employees.add(emp);
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(id + " " + name + " " + age + " " + salary + "\n");
        bw.close();
    }
    void displayAll() throws IOException {
        Scanner sc = new Scanner(file);
        System.out.println("----Report-----");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            Employee emp = new Employee(Integer.parseInt(tokens[0]), tokens[1],
                    Integer.parseInt(tokens[2]), Double.parseDouble(tokens[3]));
            emp.display();
        }
        System.out.println("----End of Report-----");
        sc.close();
    }
}
public class Exp_7 {
    public static void main(String[] args) throws IOException {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Employee Age: ");
                int age = sc.nextInt();
                System.out.print("Enter Employee Salary: ");
                double salary = sc.nextDouble();
                ems.addEmployee(id, name, age, salary);
            } else if (choice == 2) {
                ems.displayAll();
            } else if (choice == 3) {
                System.out.println("Exiting the System");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}