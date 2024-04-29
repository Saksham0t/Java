package Class_614;
import java.util.ArrayList;
import java.util.Scanner;

public class Exp_6 {
    private ArrayList<String> list = new ArrayList<String>();

    public void performOperations() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String element, positionStr;
        int position;
        boolean found;
        do {
            System.out.println("\nList Operations Menu:");
            System.out.println("1. Insertion");
            System.out.println("2. Deletion");
            System.out.println("3. Searching");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    element = scanner.next();
                    System.out.print("Enter the position to insert: ");
                    positionStr = scanner.next();
                    position = Integer.parseInt(positionStr);
                    insertAt(position, element);
                    break;
                case 2:
                    System.out.print("Enter the element to delete: ");
                    element = scanner.next();
                    delete(element);
                    break;
                case 3:
                    System.out.print("Enter the element to search: ");
                    element = scanner.next();
                    found = search(element);
                    if (found) {
                        System.out.println("Element found!");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        scanner.close();
    }

    public void insertAt(int position, String element) {
        if (position >= 0 && position <= list.size()) {
            list.add(position, element);
            System.out.println("Element inserted successfully.");
        } else {
            System.out.println("Invalid position. Element not inserted.");
        }
    }

    public void delete(String element) {
        if (list.contains(element)) {
            list.remove(element);
            System.out.println("Element deleted successfully.");
        } else {
            System.out.println("Element not found. Deletion failed.");
        }
    }

    public boolean search(String element) {
        return list.contains(element);
    }

    public void display() {
        System.out.print("List: ");
        for (String i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Exp_6 listOperations = new Exp_6();
        listOperations.performOperations();
    }
}
