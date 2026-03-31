import java.io.*;
import java.util.*;
public class CSVToObject {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\csv-to-object\\data.csv"));
            List<Student> list = new ArrayList<>();
            String line = br.readLine(); 
            while((line = br.readLine()) != null) {
                String[] d = line.split(",");
                list.add(new Student(d[0], d[1], d[2], d[3]));
            }
            br.close();
            for(Student s : list) {
                System.out.println(s);
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
