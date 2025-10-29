package Com.school;

import java.util.*;

public class RegistrationService {

    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Staff> staffMembers = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    private FileStorageService fileStorageService;

    public RegistrationService(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    public void registerStudent(Student s) { students.add(s); }
    public void registerTeacher(Teacher t) { teachers.add(t); }
    public void registerStaff(Staff s) { staffMembers.add(s); }
    public void createCourse(Course c) { courses.add(c); }

    public List<Student> getStudents() { return students; }
    public List<Teacher> getTeachers() { return teachers; }
    public List<Staff> getStaffMembers() { return staffMembers; }
    public List<Course> getCourses() { return courses; }

    public Student findStudentById(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    public Course findCourseById(int id) {
        return courses.stream().filter(c -> c.getCourseId() == id).findFirst().orElse(null);
    }

    public List<Person> getAllPeople() {
        List<Person> people = new ArrayList<>();
        people.addAll(students);
        people.addAll(teachers);
        people.addAll(staffMembers);
        return people;
    }

    public void saveAllRegistrations() {
        fileStorageService.saveData(students, "students.txt");
        fileStorageService.saveData(teachers, "teachers.txt");
        fileStorageService.saveData(staffMembers, "staff.txt");
        fileStorageService.saveData(courses, "courses.txt");
    }
}