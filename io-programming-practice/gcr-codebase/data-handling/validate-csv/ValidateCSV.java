import java.io.*;
public class ValidateCSV {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\validate-csv\\contacts.csv"));
            String line = br.readLine();
            while((line = br.readLine()) != null) {
                String[] d = line.split(",");
                String email = d[2];
                String phone = d[3];
                if(!email.matches("^[A-Za-z0-9+_.-]+@(.+)$") || !phone.matches("\\d{10}")) {
                    System.out.println("Invalid Row: " + line);
                }
            }
            br.close();
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
