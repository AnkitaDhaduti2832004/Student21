import java.util.HashMap;
import java.util.Map;

public class Student_cource {
    private int semesterNumber;
    private Map<String, Integer> coursesMarks;

    // Constructor
    public  Student_cource (int semesterNumber) {
        this.semesterNumber = semesterNumber;
        this.coursesMarks = new HashMap<>();
    }

    // Method to add course and marks
    public void addCourse(String courseName, int marksObtained) {
        coursesMarks.put(courseName, marksObtained);
    }

    // Method to display courses and marks
    public void displayCoursesAndMarks() {
        System.out.println("Courses and Marks for Semester " + semesterNumber + ":");
        for (Map.Entry<String, Integer> entry : coursesMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " marks");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example usage
        Student_cource  semester1 = new  Student_cource (1);
        semester1.addCourse("Mathematics", 85);
        semester1.addCourse("Physics", 75);
        semester1.addCourse("Chemistry", 80);
        semester1.displayCoursesAndMarks();

        Student_cource  semester2 = new  Student_cource (2);
        semester2.addCourse("Computer Science", 90);
        semester2.addCourse("Biology", 78);
        semester2.addCourse("English", 88);
        semester2.displayCoursesAndMarks();
    }
}
