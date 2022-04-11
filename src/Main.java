import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * This Program has been tested successfully on machine running java version 17 & MySQL version 8.0.28
 * & MySQL connector version 8.0.28.
 */


public class Main {

    public static void main(String[] args) throws SQLException, IOException {
        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome To Student Management Service");

        int choice;
        do {
            System.out.println("\nPress 1 for ADD student");
            System.out.println("Press 2 for UPDATE student");
            System.out.println("Press 3 for DELETE student");
            System.out.println("Press 4 for SELECT student");
            System.out.println("Press 5 for LIST student");
            System.out.println("Press 6 for Exit student");
            System.out.println("\nEnter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.updateStudent();
                    break;
                case 3:
                    studentService.deleteStudent();
                    break;
                case 4:
                    studentService.selectStudent();
                    break;
                case 5:
                    studentService.selectAllUsers();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Please Enter Valid Choice");
                    break;
            }
        } while (choice <= 6);
    }
}
