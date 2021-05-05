import java.util.Locale;

public class Instructor extends User {
    private String firstname;
    private String lastname;

    public Instructor(int id, String email, String password, String firstname, String lastname) {
        super(id, email, password);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getInstructorCode() {
        return (lastname.substring(0, 2) + firstname.substring(0, 2) + getEmail().substring(0, 3) + getId()).toLowerCase(Locale.ROOT);
    }
}
