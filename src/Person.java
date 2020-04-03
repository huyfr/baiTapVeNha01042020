import java.util.Scanner;

public class Person {
    public static Scanner sc = new Scanner(System.in);

    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, String dateOfBirth, String address) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputValues() {

        System.out.println("Nhap thong tin ca nhan:");
        System.out.print("Ten: ");
        name = sc.nextLine();

        System.out.print("Gioi tinh: ");
        gender = sc.nextLine();

        System.out.print("Ngay/thang/nam sinh: ");
        dateOfBirth = sc.nextLine();

        System.out.print("Dia chi: ");
        address = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Ten:" + name + "\n" + "Gioi tinh: " + gender + "\n" + "Ngay sinh: " + dateOfBirth + "\n" + "Dia chi: " + address;
    }
}
