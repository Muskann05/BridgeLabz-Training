import java.io.*;
public class StudentDataStream {
    public static void main(String[] args) {
        // Writing
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("Muskan");
            dos.writeDouble(8.5);
            System.out.println("Student data saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Reading
        try (DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"))) {
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println("Roll: " + roll);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
