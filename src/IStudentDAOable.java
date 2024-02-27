import java.awt.*;
import java.util.List;

public interface IStudentDAOable {
    List<Student> getAllStudents();
    Student GetStudent(int rollNumber);
    void UpdateStudent(Student student);
    void DeleteStudent(Student student);

}
