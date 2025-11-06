import java.util.Scanner;

public class Student {
    int id;
    String name;
    String department;
    double cgpa;
    static String university;
    static int totalStudents = 0;

    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        totalStudents++;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
        System.out.println();
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter university : ");
        university = scanner.nextLine();


        System.out.println("\nEnter details for Student 1:");
        System.out.print("ID: ");
        int id1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Department: ");
        String department1 = scanner.nextLine();
        System.out.print("CGPA: ");
        double cgpa1 = Double.parseDouble(scanner.nextLine());
        Student student1 = new Student(id1, name1, department1, cgpa1);


        System.out.println("\nEnter details for Student 2:");
        System.out.print("ID: ");
        int id2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Department: ");
        String department2 = scanner.nextLine();
        System.out.print("CGPA: ");
        double cgpa2 = Double.parseDouble(scanner.nextLine());
        Student student2 = new Student(id2, name2, department2, cgpa2);


        System.out.println("\nEnter details for Student 3:");
        System.out.print("ID: ");
        int id3 = Integer.parseInt(scanner.nextLine());
        System.out.print("Name: ");
        String name3 = scanner.nextLine();
        System.out.print("Department: ");
        String department3 = scanner.nextLine();
        System.out.print("CGPA: ");
        double cgpa3 = Double.parseDouble(scanner.nextLine());
        Student student3 = new Student(id3, name3, department3, cgpa3);


        System.out.println("\n--- Student Details ---");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();

        displayTotalStudents();
    }
}
