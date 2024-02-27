import java.util.ArrayList;
import java.util.List;

public class StudentDaoImplement implements IStudentDAOable {

    List<Student> studentList;
    public StudentDaoImplement() {
        studentList = new ArrayList<>();
        var student1 = new Student("Melares",0);
        var student2 = new Student("Kfafsm",1);
        studentList.add(student1);
        studentList.add(student2);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public Student GetStudent(int rollNumber) {
        return studentList.get(rollNumber);
    }

    @Override
    public void UpdateStudent(Student student) {
        studentList.get(student.getRollNumber()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNumber() + ", updated in the database");
    }

    @Override
    public void DeleteStudent(Student student) {
        studentList.remove(student.getRollNumber());
        System.out.println("Student Deleted");
    }

}
