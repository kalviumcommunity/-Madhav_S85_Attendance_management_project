package Com.school;

public class Staff extends Person implements Storable {
    private String role;

    public Staff(String name, String role) {
        super(name);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(", Staff Role: " + role + " (Role: Staff)");
    }

    @Override
    public String toDataString() {
        // Format: id,name,role
        return getId() + "," + getName() + "," + role;
    }
}