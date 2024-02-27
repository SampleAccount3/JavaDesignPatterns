import java.lang.System;

public class Main {
    public static void main(String[] args) {

        IStudentDAOable studentDAO = new StudentDaoImplement();

        for (Student student: studentDAO.getAllStudents()){
            System.out.println("Student: [RollNo : " + student.getRollNumber() + ", Name : " + student.getName() + " ]");
        }


        Student student = studentDAO.getAllStudents().get(0);
        student.setName("Michael");
        studentDAO.UpdateStudent(student);
//        //get the student
        studentDAO.GetStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNumber() + ", Name : " + student.getName() + " ]");
//        studentDAO.GetStudent(1);
//        System.out.println("Student: [RollNo : " + student.getRollNumber() + ", Name : " + student.getName() + " ]");
    }
}
