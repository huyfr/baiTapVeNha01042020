public class Main {
    public static void main(String[] args) {
        long startTime, endTime, duration;
        //start test bai1
/*        Person person = new Person("Huy", "male", "1/1/1111", "11xx");

        System.out.println(person.getName());
        System.out.println(person.getGender());
        System.out.println(person.getDateOfBirth());
        System.out.println(person.getAddress() + "\n");
        System.out.println(person.toString() + "\n");

        person.inputValues();
        System.out.println("\n" + person.toString());*/
        //end test bai1

        //start test bai 2
/*        Student student = new Student(1421030094, 7.0, "abc@gmail.com");
        System.out.println(student.getIdStudent());
        System.out.println(student.getGPA());
        System.out.println(student.getEmail());
        System.out.println("Scholarship: "+student.isScholarship() + "\n");

        student.inputValues();
        System.out.println("\n" + student.toString());
        System.out.println("Scholarship: "+student.isScholarship() + "\n");*/
        //end test bai 2

        //start test bai 3 ArrayList va LinkedList
        StudentManagement studentManagement = new StudentManagement();
        StudentManagement studentManagement1 = new StudentManagement();

        Student studentAL1 = new Student("A", "male", "2/2/2222", "22a", 1, 9, "linh@gmail.com");
        Student studentAL2 = new Student("B", "female", "2/2/2222", "22a", 2, 8, "linh1@gmail.com");
        studentManagement.arrayList.add(studentAL1);
        studentManagement.arrayList.add(studentAL2);

        Student studentLL1 = new Student("A", "male", "2/2/2222", "22a", 1, 9, "linh@gmail.com");
        Student studentLL2 = new Student("B", "female", "2/2/2222", "22a", 2, 8, "linh1@gmail.com");
        studentManagement1.linkedList.add(studentLL1);
        studentManagement1.linkedList.add(studentLL2);

        //display student AL
        startTime = System.nanoTime();
        studentManagement.displayArrayList();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList display:  " + duration+"\n");

        //display student LL
        startTime = System.nanoTime();
        studentManagement1.displayLinkedList();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList display:  " + duration+"\n");

/*        //add student AL
        startTime = System.nanoTime();
        studentManagement.inputListArrayList();
        System.out.println();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList add:  " + duration+"\n");

        //add student LL
        startTime = System.nanoTime();
        studentManagement1.inputListLinkedList();
        System.out.println();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add:  " + duration+"\n");*/

/*        //edit information AL
        startTime = System.nanoTime();
        studentManagement.editInformationArrayList(2);
        System.out.println();
        studentManagement.displayArrayList();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList edit:  " + duration+"\n");

        //edit information LL
        startTime = System.nanoTime();
        studentManagement1.editInformationLinkedList(2);
        System.out.println();
        studentManagement1.displayLinkedList();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList edit:  " + duration+"\n");*/

        //find by id AL
        startTime = System.nanoTime();
        studentManagement.findIdArrayList(2);
        System.out.println();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList find by id:  " + duration+"\n");

        //find by id LL
        startTime = System.nanoTime();
        studentManagement1.findIdLinkedList(2);
        System.out.println();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList find by id:  " + duration+"\n");

        //find by name AL
        startTime = System.nanoTime();
        studentManagement.findNameArrayList("B");
        System.out.println();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList find by name:  " + duration+"\n");

        //find by name LL
        startTime = System.nanoTime();
        studentManagement1.findNameLinkedList("B");
        System.out.println();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList find by name:  " + duration+"\n");

        //display scholarship AL
        startTime = System.nanoTime();
        studentManagement.displayScholarshipArrayList();
        System.out.println();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList display scholarship:  " + duration+"\n");

        //display scholarship LL
        startTime = System.nanoTime();
        studentManagement1.displayScholarshipLinkedList();
        System.out.println();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList display scholarship:  " + duration+"\n");

        //display female AL
        startTime = System.nanoTime();
        studentManagement.displayFemaleArrayList();
        System.out.println();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList display female:  " + duration+"\n");

        //display female LL
        startTime = System.nanoTime();
        studentManagement1.displayFemaleLinkedList();
        System.out.println();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList display female:  " + duration+"\n");

        //remove student AL
        startTime = System.nanoTime();
        studentManagement.removeStudentArrayList(1);
        studentManagement.displayArrayList();
        System.out.println();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove student:  " + duration+"\n");

        //remove student LL
        startTime = System.nanoTime();
        studentManagement1.removeStudentLinkedList(1);
        studentManagement1.displayLinkedList();
        System.out.println();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove student:  " + duration+"\n");
        //end test bai 3 ArrayList va LinkedList
    }
}