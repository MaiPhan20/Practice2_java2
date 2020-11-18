
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LogicOption {
    String url = "jdbc:mysql://localhost:3306/student";
    String username = "root";
    String password = "";
    Scanner s = new Scanner(System.in);


    public ArrayList addContact(ArrayList<Contact> list) {

        String answer = "";
        do {
            System.out.println("Enter your name: ");
            String name = s.nextLine();
            System.out.println("Enter your StudentId: ");
            String studentId = s.nextLine();
            System.out.print("Enter your Address: ");
            String address = s.nextLine();
            System.out.print("Enter your phone: ");
            String phone = s.nextLine();
            System.out.print("Chose Yes/No back home: ");
            answer = s.nextLine();
            list.add(new Contact(name, studentId, address, phone));
        } while (answer.equalsIgnoreCase("No"));
        return list;
    }

    public void findContact(ArrayList<Contact> list, String name) {
        System.out.println("Name ||\t StudentId || \tAddress  ||  Phone");
        for (int i = 0; i < list.size(); i++) {
            if (name.equalsIgnoreCase(list.get(i).getName())) {
                System.out.println(list.get(i).getName() + "  " + list.get(i).getStudentId() + " \t\t" + list.get(i).getAddress() + " \t " + list.get(i).getPhone() + "\n");
                break;
            }
        }
        System.out.println();
    }
    public boolean updateToDB(List<Contact> list) {
        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
        ) {
            String insert;
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                insert = "insert into student(studentID,studentName,address,phone) values('" + list.get(i).getStudentId() + "','" + list.get(i).getName() + "','" + list.get(i).getAddress() + "'," + list.get(i).getPhone() + ")";
                count += stmt.executeUpdate(insert);
            }
            System.out.println(count + " row(s) affected");
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    public void displayContact(ArrayList<Contact> list) {
        System.out.println("Name || StudentId || Address  ||  Phone");
        for (Contact c : list) {
            System.out.println(c.getName() + "  " + c.getStudentId() + " \t\t " + c.getAddress() + " \t " + c.getPhone());
        }
        System.out.println();
    }

}
