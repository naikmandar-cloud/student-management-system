public class Student {
    private int id;
    private String name;
    private String Dob;
    private String Doj;

    public Student(int id, String name, String dob, String doj) {
        this.id = id;
        this.name = name;
        Dob = dob;
        Doj = doj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String dob) {
        Dob = dob;
    }

    public String getDoj() {
        return Doj;
    }

    public void setDoj(String doj) {
        Doj = doj;
    }
}
