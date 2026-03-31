import java.io.*;
public class ReadCSV {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\read-csv\\students.csv"));
            String line = br.readLine(); 
            while((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("ID: " + data[0] + ", Name: " + data[1] +
                        ", Age: " + data[2] + ", Marks: " + data[3]);
            }
            br.close();
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
