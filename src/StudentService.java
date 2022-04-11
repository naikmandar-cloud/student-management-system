import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    Scanner sc = new Scanner(System.in);
    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(r);
    StudentDao studentDao = new StudentDao();

    public void addStudent() throws IOException {
        System.out.println("Enter student No: ");
        int id = sc.nextInt();

        System.out.println("Enter student name: ");
        String name = bufferedReader.readLine();

        System.out.println("Enter student Date of Birth: ");
        String dob = bufferedReader.readLine();

        System.err.println("Enter Date of Joining: ");
        String doj = bufferedReader.readLine();

        Student student = new Student(id, name , dob , doj);
        boolean success = studentDao.insertUser(student);
        if(success) {
            System.out.println("record inserted successfully");
        } else {
            System.out.println("Something went wrong! try again");
        }
    }

    public void updateStudent() throws SQLException, IOException {
        boolean success = false;

        System.out.println("Enter Student No to update");
        int number = Integer.parseInt(sc.next());

        System.out.println("Enter student No: ");
        int id = sc.nextInt();

        System.out.println("Enter student name: ");
        String name = bufferedReader.readLine();

        System.out.println("Enter student Date of Birth: ");
        String dob = bufferedReader.readLine();

        System.err.println("Enter Date of Joining: ");
        String doj = bufferedReader.readLine();

        Student student = new Student(id, name , dob , doj);
        success = studentDao.updateUser(number, student);
        if(success) {
            System.out.println("record updated successfully");
        } else {
            System.out.println("Something went wrong! try again");
        }
    }

    public void deleteStudent() throws SQLException {
        boolean success = false;
        System.out.println("Enter Student No to Delete");
        int number = sc.nextInt();

        success = studentDao.deleteUser(number);
        if(success) {
            System.out.println("record Deleted successfully");
        } else {
            System.out.println("Something went wrong! try again");
        }
    }

    public void selectStudent() {
        System.out.println("Enter Student No to update");
        int number = sc.nextInt();

        studentDao.selectUser(number);
    }

    public void selectAllUsers() {
        List<Student> students = studentDao.selectAllUsers();
        for (Student student: students) {
            System.out.println(student.getId() + " " + student.getName()+ " " + student.getDob() + " " + student.getDoj());
        }
    }
}
