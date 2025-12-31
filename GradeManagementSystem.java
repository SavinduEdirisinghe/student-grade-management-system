import java.util.ArrayList;
import java.util.List;

/**
 * Main program to demonstrate the Student Grade Management System
 */
public class GradeManagementSystem {
    
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("STUDENT GRADE MANAGEMENT SYSTEM");
        System.out.println("=".repeat(60));
        System.out.println();
        
        // Create courses
        Course csp3341 = new Course("CSP3341", "Programming Languages", 25);
        Course csi3344 = new Course("CSI3344", "Distributed Systems", 25);
        Course csp2348 = new Course("CSP2348", "Data Structures", 25);
        
        System.out.println("Courses created:");
        System.out.println("  - " + csp3341);
        System.out.println("  - " + csi3344);
        System.out.println("  - " + csp2348);
        System.out.println();
        
        // Create students
        Student student1 = new Student(1001, "John Smith");
        Student student2 = new Student(1002, "Emma Wilson");
        
        System.out.println("Students enrolled:");
        System.out.println("  - ID: " + student1.getStudentId() + ", Name: " + student1.getName());
        System.out.println("  - ID: " + student2.getStudentId() + ", Name: " + student2.getName());
        System.out.println();
        
        // Assign grades to Student 1
        System.out.println("Assigning grades to " + student1.getName() + "...");
        Grade grade1 = new Grade(student1, csp3341, 87.5);
        Grade grade2 = new Grade(student1, csi3344, 92.0);
        Grade grade3 = new Grade(student1, csp2348, 78.5);
        
        student1.addGrade(grade1);
        student1.addGrade(grade2);
        student1.addGrade(grade3);
        
        System.out.println("  - " + grade1);
        System.out.println("  - " + grade2);
        System.out.println("  - " + grade3);
        System.out.println();
        
        // Assign grades to Student 2
        System.out.println("Assigning grades to " + student2.getName() + "...");
        Grade grade4 = new Grade(student2, csp3341, 95.0);
        Grade grade5 = new Grade(student2, csi3344, 88.0);
        Grade grade6 = new Grade(student2, csp2348, 91.5);
        
        student2.addGrade(grade4);
        student2.addGrade(grade5);
        student2.addGrade(grade6);
        
        System.out.println("  - " + grade4);
        System.out.println("  - " + grade5);
        System.out.println("  - " + grade6);
        System.out.println();
        
        // Display student summaries
        System.out.println("=".repeat(60));
        System.out.println("STUDENT PERFORMANCE SUMMARY");
        System.out.println("=".repeat(60));
        System.out.println();
        
        displayStudentSummary(student1);
        System.out.println();
        displayStudentSummary(student2);
        
        System.out.println();
        System.out.println("=".repeat(60));
        System.out.println("System demonstration completed successfully!");
        System.out.println("=".repeat(60));
    }
    
    /**
     * Displays detailed summary for a student
     * @param student The student to display
     */
    private static void displayStudentSummary(Student student) {
        System.out.println("Student: " + student.getName() + " (ID: " + student.getStudentId() + ")");
        System.out.println("-".repeat(60));
        System.out.println("Grades:");
        
        for (Grade grade : student.getGrades()) {
            System.out.println("  " + grade);
        }
        
        System.out.println("-".repeat(60));
        System.out.printf("GPA: %.2f%n", student.calculateGPA());
        System.out.println("Letter Grade: " + student.getLetterGrade());
    }
}