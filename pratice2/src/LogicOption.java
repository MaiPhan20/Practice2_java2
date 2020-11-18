
import java.util.ArrayList;
import java.util.Scanner;
public class LogicOption {

    Scanner s = new Scanner(System.in);

    public ArrayList addContact(ArrayList<Contact> list) {

        String answer = "";
        do {
            System.out.print("Enter your name: ");
            String name = s.nextLine();
            System.out.print("Enter your StudentId: ");
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

    public void displayContact(ArrayList<Contact> list) {
        System.out.println("Name || StudentId || Address  ||  Phone");
        for (Contact c : list) {
            System.out.println(c.getName() + "  " + c.getStudentId() + " \t\t " + c.getAddress() + " \t " + c.getPhone());
        }
        System.out.println();
    }

}
