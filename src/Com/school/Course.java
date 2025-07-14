package Com.school;

public class Course {
    int courseId;

    String courseName;

    public void setDetails(int courseId, String courseName) {

        this.courseId = courseId;

        this.courseName = courseName;
    }
    public void displayDetails() {

        System.out.println("Course ID: " + this.courseId + ", Name: "+ this.courseName);

    }
}
