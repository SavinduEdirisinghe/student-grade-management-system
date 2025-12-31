/**
 * Represents a grade for a student in a specific course
 */
public class Grade {
    private Student student;
    private Course course;
    private double numericMark;
    private String letterGrade;
    
    /**
     * Constructor for Grade
     * @param student The student
     * @param course The course
     * @param mark The numeric mark (0-100)
     */
    public Grade(Student student, Course course, double mark) {
        this.student = student;
        this.course = course;
        this.numericMark = mark;
        this.letterGrade = calculateLetterGrade(mark);
    }
    
    /**
     * Converts numeric mark to letter grade
     * @param mark The numeric mark
     * @return Letter grade
     */
    private String calculateLetterGrade(double mark) {
        if (mark >= 85) return "A";
        if (mark >= 75) return "B";
        if (mark >= 65) return "C";
        if (mark >= 50) return "D";
        return "F";
    }
    
    /**
     * Converts letter grade to grade points for GPA calculation
     * @return Grade points (4.0 scale)
     */
    public double getGradePoints() {
        switch (letterGrade) {
            case "A": return 4.0;
            case "B": return 3.0;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }
    
    // Getters
    public Student getStudent() { return student; }
    public Course getCourse() { return course; }
    public double getNumericMark() { return numericMark; }
    public String getLetterGrade() { return letterGrade; }
    
    @Override
    public String toString() {
        return course.getCourseCode() + ": " + numericMark + "% (" + letterGrade + ")";
    }
}
