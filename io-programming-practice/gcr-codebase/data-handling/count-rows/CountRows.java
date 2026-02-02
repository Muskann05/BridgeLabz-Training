import java.io.*;
public class CountRows {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\count-rows\\students.csv"));
            String line = br.readLine();
            int count = 0;
            while((line = br.readLine()) != null) {
                count++;
            }
            br.close();
            System.out.println("Total Records: " + count);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
