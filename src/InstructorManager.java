import org.jetbrains.annotations.NotNull;

public class InstructorManager extends UserManager {
    @Override
    public void add() {
        System.out.println("Öğretmen eklendi");
    }

    @Override
    public void update() {
        System.out.println("Öğretmen güncellendi.");
    }

    @Override
    public void delete() {
        System.out.println("Öğretmen silindi.");
    }

    public void addStudent(Student user) {
        System.out.println("'" + user.getStudentCode() + "'" + " Kodlu öğrenci artık öğrenciniz");
    }
}
