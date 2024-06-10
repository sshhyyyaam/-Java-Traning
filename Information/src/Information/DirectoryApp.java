package Information;

import java.util.Scanner;

public class DirectoryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Directory directory = new Directory();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Display all entries");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Telephone (if available with STD code): ");
                    String telephone = scanner.nextLine();
                    System.out.print("Enter Mobile (if available): ");
                    String mobile = scanner.nextLine();
                    System.out.print("Enter Head of Family: ");
                    String headOfFamily = scanner.nextLine();
                    System.out.print("Enter Unique ID No: ");
                    String uniqueID = scanner.nextLine();

                    Person newPerson = new Person(name, address, telephone, mobile, headOfFamily, uniqueID);
                    if (directory.addPerson(newPerson)) {
                        System.out.println("Entry added successfully.");
                    } else {
                        System.out.println("Entry not added. Unique ID must be unique, and telephone numbers can be the same only if the head of family is the same.");
                    }
                    break;
                case 2:
                    directory.displayAll();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}
