import java.io.*;
public class FilterStudents {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\filter-records\\students.csv"));
            String line = br.readLine(); 
            while((line = br.readLine()) != null) {
                String[] d = line.split(",");
                int marks = Integer.parseInt(d[3]);
                if (marks > 80) {
                    System.out.println(line);
                }
            }
            br.close();
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
