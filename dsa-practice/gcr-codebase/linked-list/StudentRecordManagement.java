// Node class represent student data 

class StudentNode {
    int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;

    StudentNode(int rollNo, String name, int age, char grade){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;

    }
}

// Singly Linked List class 

class StudentLinkedList {
    private StudentNode head;

    // add at beginning
    public void addAtBeginning(int rollNo, String name, int age, char grade){
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }
    
    // add at end
    public void addAtEnd(int rollNo, String name, int age, char grade){
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        if(head == null){
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific position
    public void addAtPosition(int position, int rollNo, String name, int age, char grade){
        if(position <= 1){
            addAtBeginning(rollNo, name, age, grade);
            return;
        }
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        StudentNode temp = head;

        for(int i=1;i < position-1 && temp != null; i++){
            temp = temp.next;

        }
        if(temp==null){
            System.out.println("Position out of range");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Roll Number
    public void deleteByRollNo(int rollNo){
        if(head==null){
            return;
        }
        if(head.rollNo == rollNo){
            head = head.next;
            System.out.println("Roll No. Deleted");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Roll No deleted");
        }
    }

    // Search by Roll No.
    public void searchByRollNo(int rollNo){
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                System.out.println("Roll No: " + temp.rollNo);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update Grade
    public void updateGrade(int rollNo, char newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll No " + rollNo);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Display all records
    public void displayStudents() {
        if (head == null) {
            System.out.println("No student records available");
            return;
        }

        StudentNode temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println(
                "Roll No: " + temp.rollNo +
                ", Name: " + temp.name +
                ", Age: " + temp.age +
                ", Grade: " + temp.grade
            );
            temp = temp.next;
        }
    }
}

// Main class 
public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.addAtBeginning(101, "Muskan", 20, 'A');
        list.addAtEnd(102, "Muskann", 21, 'B');
        list.addAtEnd(103, "Muskiiii", 22, 'C');
        list.addAtPosition(2, 104, "Musk", 19, 'A');

        list.displayStudents();

        list.searchByRollNo(102);
        list.updateGrade(103, 'B');
        list.deleteByRollNo(101);

        list.displayStudents();

    }
}

