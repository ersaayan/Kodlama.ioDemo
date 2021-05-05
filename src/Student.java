import java.util.Locale;

public class Student extends User {
    private String firstname;
    private String lastname;
    private String studentNumber;

    public Student(int id, String email, String password, String firstname, String lastname) {
        super(id, email, password);
        this.setFirstname(firstname);
        this.setLastname(lastname);
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

    public String getStudentCode() {
        return (firstname.substring(0, 2) + lastname.substring(0, 2) + getId()).toLowerCase(Locale.ROOT);
    }


}
