package Com.school;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- School Administration System ---");

        FileStorageService storageService = new FileStorageService();
        RegistrationService registrationService = new RegistrationService(storageService);

        // --- Register People ---
        Student s1 = new Student("Alice Wonderland", "Grade 10");
        Student s2 = new Student("Bob The Builder", "Grade 9");
        Teacher t1 = new Teacher("Dr. Strange", "Physics");
        Teacher t2 = new Teacher("Prof. Turing", "Computer Science");
        Staff st1 = new Staff("Mr. Clean", "Janitor");

        registrationService.registerStudent(s1);
        registrationService.registerStudent(s2);
        registrationService.registerTeacher(t1);
        registrationService.registerTeacher(t2);
        registrationService.registerStaff(st1);

        // --- Create Courses ---
        Course c1 = new Course("Intro to Quantum Physics");
        Course c2 = new Course("Advanced Algorithms");
        registrationService.createCourse(c1);
        registrationService.createCourse(c2);

        // --- Display Directory ---
        System.out.println("\n--- School Directory ---");
        for (Person p : registrationService.getAllPeople()) {
            p.displayDetails();
        }

        // --- Display Courses ---
        System.out.println("\n--- Courses ---");
        for (Course c : registrationService.getCourses()) {
            c.displayDetails();
        }

        // --- Save Everything ---
        System.out.println("\n--- Saving All Data ---");
        registrationService.saveAllRegistrations();
        System.out.println("✅ All data saved successfully.");

        System.out.println("\nPart 9 complete. Check students.txt, teachers.txt, staff.txt, and courses.txt");
    }
}