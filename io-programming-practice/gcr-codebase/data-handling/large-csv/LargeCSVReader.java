import java.io.*;
public class LargeCSVReader {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\large-csv\\large.csv"));
            String line = br.readLine(); 
            int count = 0;
            int batch = 0;
            while((line = br.readLine()) != null) {
                count++;
                batch++;
                if(batch == 100) {
                    System.out.println("Processed " + count + " records");
                    batch = 0;
                }
            }
            br.close();
            System.out.println("Total records processed: " + count);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
