package HW;

import java.util.Scanner;

public class StudentManager {   
    private static final int MAX_STUDENTS = 100;
    private static Student[] students = new Student[MAX_STUDENTS];
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
        try {
            if (studentCount >= MAX_STUDENTS) {
                throw new Exception("학생 수는 100을 넘길 수 없습니다.");
            }
    
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
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    

    private static void searchStudent() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student != null && student.getStudentId().equals(studentId)) {
                System.out.println(student.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
	}


	private static void modifyStudent() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        boolean found = false;
    
        for (Student student : students) {
            if (student != null && student.getStudentId().equals(studentId)) {
                //검색할려는 학번이 같다면...
                //뭘 수정해야하는가? 학번은 제외
                //Name, Major, Grade 
                System.out.println("Name : ");
                String name = scanner.nextLine();
                student.setName(name);
    
                System.out.println("Major : ");
                String major = scanner.nextLine();
                student.setMajor(major);
    
                System.out.println("Grade : ");
                int grade = scanner.nextInt();
                student.setGrade(grade);
                found = true;
                break;
            }
        }
    
        if (!found) {
            System.out.println("Student not found.");
        }
    }

	private static void deleteStudent() {
		System.out.print("Enter student ID: ");
		String studentId = scanner.nextLine();

		for (int i = 0; i < studentCount; i++) {
			// 약 4~10라인 
            if (students[i].getStudentId().equals(studentId)) {
                students[i] = null;
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null; 
                System.out.println("삭제했습니다.");
                return;
            }
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
