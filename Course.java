/**
 * Represents a course with code, name, and credit points
 */
public class Course {
    private String courseCode;
    private String courseName;
    private int creditPoints;
    
    /**
     * Constructor for Course
     * @param code The course code (e.g., "CSP3341")
     * @param name The course name
     * @param credits The credit points for the course
     */
    public Course(String code, String name, int credits) {
        this.courseCode = code;
        this.courseName = name;
        this.creditPoints = credits;
    }
    
    /**
     * Gets course information as a formatted string
     * @return Course information
     */
    public String getCourseInfo() {
        return courseCode + ": " + courseName + " (" + creditPoints + " credits)";
    }
    
    // Getters
    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public int getCreditPoints() { return creditPoints; }
    
    @Override
    public String toString() {
        return getCourseInfo();
    }
}