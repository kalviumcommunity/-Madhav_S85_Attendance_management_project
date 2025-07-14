package Com.school;


public class Student {

    int Id;

    String studentName;

    public void setDetails(int id, String studentName) {

        this.Id = id;

        this.studentName = studentName;
    }
    public void displayDetails() {

        System.out.println("Student ID: " + this.Id + ", Name: "+ this.studentName);

    }
}