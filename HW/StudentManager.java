package HW;

import java.util.Scanner;

import java_05.student;

public class StudentManager {   
    private static final int MAX_STUDENTS = 100;
    private static Student[] students;
    private static int studentCount = 0 ;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    modifyStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    displayAllStudents();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nStudent Management System:");
        System.out.println("1. Add Student");
        System.out.println("2. Search Student");
        System.out.println("3. Modify Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Display All Students");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter major: ");
        String major = scanner.nextLine();
        System.out.print("Enter grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        students[studentCount++] = new Student(name, studentId, major, grade);
        System.out.println("Student added successfully!");
    }

    private static void searchStudent() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        for (Student student : students) {
           if(student.getStudentId() ==  studentId)
           {
            System.out.println(student.toString());
           }
           return;
		}
		System.out.println("Student not found.");
	}


	private static void modifyStudent() {
		System.out.print("Enter student ID: ");
		String studentId = scanner.nextLine();

		for (Student student : students) {
			// 약 10~15라인  
            
		}
		System.out.println("Student not found.");
	}

	private static void deleteStudent() {
		System.out.print("Enter student ID: ");
		String studentId = scanner.nextLine();

		for (int i = 0; i < studentCount; i++) {
			// 약 4~10라인 
		}
		System.out.println("Student not found.");
	}

	private static void displayAllStudents() {
		System.out.println("Student List:");
		for (int i = 0; i < studentCount; i++) {
			System.out.println((i + 1) + ". " + students[i].toString());
		}
	}
}
