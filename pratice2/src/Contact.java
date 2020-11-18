
public class Contact {

    private String name;
    private String StudentId;
    private String Address;
    private String Phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getAddress () {
        return Address;
    }

    public void setEmail(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public Contact(String name, String studentId, String address, String phone) {
        super();
        this.name = name;
        StudentId = studentId;
        Address = address;
        Phone = phone;
    }

    public Contact() {
        super();
        // TODO Auto-generated constructor stub
    }

}
