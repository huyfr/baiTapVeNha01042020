import java.util.Scanner;

public class Student extends Person {
    private int idStudent;
    private double GPA;
    private String email;

    public Student() {
    }

    public Student(int idStudent, double GPA, String email) {
        this.idStudent = idStudent;
        this.GPA = GPA;
        this.email = email;
    }

    public Student(String name, String gender, String dateOfBirth, String address, int idStudent, double GPA, String email) {
        super(name, gender, dateOfBirth, address);
        this.idStudent = idStudent;
        this.GPA = GPA;
        this.email = email;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputValues() {
        super.inputValues();
        System.out.print("Ma sinh vien: ");
        idStudent = sc.nextInt();
        System.out.print("Diem trung binh: ");
        GPA = sc.nextDouble();
        sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Ma sinh vien: " + idStudent + "\n" + "Diem trung binh: " + GPA + "\n" + "Email: " + email;
    }

    public boolean isScholarship() {
        boolean scholarshipCheck = false;
        if (GPA>8){
            scholarshipCheck = true;
        }
        return scholarshipCheck;
    }
}
