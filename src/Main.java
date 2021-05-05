public class Main {

    public static void main(String[] args) {
        Student student = new Student(1, "xx@x.com", "123", "Eren", "Savk");
        Instructor instructor = new Instructor(2, "engin@x.com", "123", "Engin", "Demirog");

        StudentManager sManager = new StudentManager();
        sManager.add();
        sManager.delete();
        sManager.update();
        sManager.addInstructor(instructor);

        System.out.println(" ");

        InstructorManager iManager = new InstructorManager();
        iManager.add();
        iManager.delete();
        iManager.update();
        iManager.addStudent(student);

        System.out.println(" ");

        UserManager userManager = new UserManager();
        userManager.add();
        userManager.delete();
        userManager.update();


    }
}
