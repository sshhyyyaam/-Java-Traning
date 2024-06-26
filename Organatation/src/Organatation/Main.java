package Organatation;

public class Main {
	class Member {
	    // Data Members
	    String name;
	    int age;
	    String phoneNumber;
	    String address;
	    double salary;
	    
	    // Method to print salary
	    void printSalary() {
	        System.out.println("Salary: " + salary);
	    }
	}

	public static void main(String[] args)
	{
		Employee employee = new Employee();
        employee.name = "John Doe";
        employee.age = 30;
        employee.phoneNumber = "123-456-7890";
        employee.address = "123 Main St, City";
        employee.salary = 50000.00;
        employee.specialization = "Software Development";
        
        // Create Manager object
        Manager manager = new Manager();
        manager.name = "Jane Smith";
        manager.age = 45;
        manager.phoneNumber = "098-765-4321";
        manager.address = "456 Elm St, City";
        manager.salary = 75000.00;
        manager.department = "IT Department";
        
        
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Specialization: " + employee.specialization);
        employee.printSalary();
        
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
	}

}

    
    // Method to print salary
    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}



public class Main {
    public static void main(String[] args) {
        // Create Employee object
        Employee employee = new Employee();
        employee.name = "John Doe";
        employee.age = 30;
        employee.phoneNumber = "123-456-7890";
        employee.address = "123 Main St, City";
        employee.salary = 50000.00;
        employee.specialization = "Software Development";
        
        // Create Manager object
        Manager manager = new Manager();
        manager.name = "Jane Smith";
        manager.age = 45;
        manager.phoneNumber = "098-765-4321";
        manager.address = "456 Elm St, City";
        manager.salary = 75000.00;
        manager.department = "IT Department";
        
        // Print details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Specialization: " + employee.specialization);
        employee.printSalary();
        
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }
}

