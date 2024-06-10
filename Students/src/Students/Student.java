package Students;

public class Student {

	
    private String name;

    
    public Student(String name) {
        this.name = name;
    }

    
    public Student() {
        this.name = "Unknown";
    }

    
    public String getName() {
        return name;
    }

    
    public static void main(String[] args) {
        
        Student student1 = new Student("Shyam");

        
        Student student2 = new Student();

        
        System.out.println("Student 1 name: " + student1.getName());
        System.out.println("Student 2 name: " + student2.getName());
    }
}
