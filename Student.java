import java.util.ArrayList;
import java.util.List;

/**
 * Represents a student with ID, name, and grades
 */
public class Student {
    private int studentId;
    private String name;
    private List<Grade> grades;
    
    /**
     * Constructor for Student
     * @param id The student's unique identifier
     * @param name The student's name
     */
    public Student(int id, String name) {
        this.studentId = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }
    
    /**
     * Adds a grade to the student's record
     * @param grade The grade to add
     */
    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }
    
    /**
     * Calculates the student's GPA
     * @return The calculated GPA
     */
    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        
        double totalPoints = 0.0;
        int totalCredits = 0;
        
        for (Grade grade : grades) {
            totalPoints += grade.getGradePoints() * grade.getCourse().getCreditPoints();
            totalCredits += grade.getCourse().getCreditPoints();
        }
        
        return totalCredits > 0 ? totalPoints / totalCredits : 0.0;
    }
    
    /**
     * Gets the student's letter grade based on GPA
     * @return Letter grade (A, B, C, D, or F)
     */
    public String getLetterGrade() {
        double gpa = calculateGPA();
        if (gpa >= 3.5) return "A";
        if (gpa >= 3.0) return "B";
        if (gpa >= 2.0) return "C";
        if (gpa >= 1.0) return "D";
        return "F";
    }
    
    // Getters
    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public List<Grade> getGrades() { return grades; }
    
    @Override
    public String toString() {
        return "Student{id=" + studentId + ", name='" + name + "', GPA=" + 
               String.format("%.2f", calculateGPA()) + ", Grade=" + getLetterGrade() + "}";
    }
}