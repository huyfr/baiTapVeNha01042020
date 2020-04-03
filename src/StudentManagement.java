import java.util.ArrayList;
import java.util.LinkedList;

public class StudentManagement extends Student {
    ArrayList<Student> arrayList = new ArrayList<>();
    LinkedList<Student> linkedList = new LinkedList<>();

    public void inputListArrayList() {
        Student student = new Student();
        student.inputValues();
        arrayList.add(student);
    }

    public void displayArrayList() {
        for (Student student : arrayList) {
            System.out.println(student + "\n");
        }
    }

    public void editInformationArrayList(int id) {
        for (Student student : arrayList) {
            if (student.getIdStudent() == id) {
                student.inputValues();
            }
        }
    }

    public void removeStudentArrayList(int id) {
        int temp = 0;
        for (Student student : arrayList) {
            if (student.getIdStudent() == id) {
                arrayList.remove(temp);
            }
            temp++;
        }
    }

    public void findIdArrayList(int id) {
        for (Student student : arrayList) {
            if (student.getIdStudent() == id) {
                System.out.println(student.toString());
            }
        }
    }

    public void findNameArrayList(String name) {
        for (Student student : arrayList) {
            if (student.getName().equals(name)) {
                System.out.println(student.toString());
            }
        }
    }

    public void displayScholarshipArrayList() {
        for (Student student : arrayList) {
            if (student.isScholarship()) {
                System.out.println(student.toString());
            }
        }
    }

    public void displayFemaleArrayList() {
        for (Student student : arrayList) {
            if (student.getGender().equals("female")) {
                System.out.println(student.toString());
            }
        }
    }

    public void inputListLinkedList(){
        Student student = new Student();
        student.inputValues();
        linkedList.add(student);
    }

    public void displayLinkedList(){
        for (Student student : linkedList){
            System.out.println(student+"\n");
        }
    }

    public void editInformationLinkedList(int id) {
        for (Student student : linkedList) {
            if (student.getIdStudent() == id) {
                student.inputValues();
            }
        }
    }

    public void removeStudentLinkedList(int id){
        int temp = 0;
        for (Student student : linkedList) {
            if (student.getIdStudent() == id) {
                linkedList.remove(temp);
            }
            temp++;
        }
    }

    public void findIdLinkedList(int id) {
        for (Student student : linkedList) {
            if (student.getIdStudent() == id) {
                System.out.println(student.toString());
            }
        }
    }

    public void findNameLinkedList(String name) {
        for (Student student : linkedList) {
            if (student.getName().equals(name)) {
                System.out.println(student.toString());
            }
        }
    }

    public void displayScholarshipLinkedList() {
        for (Student student : linkedList) {
            if (student.isScholarship()) {
                System.out.println(student.toString());
            }
        }
    }

    public void displayFemaleLinkedList() {
        for (Student student : linkedList) {
            if (student.getGender().equals("female")) {
                System.out.println(student.toString());
                ;
            }
        }
    }
}