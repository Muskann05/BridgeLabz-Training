import java.io.*;
import java.util.Base64;
public class EncryptCSV {
    public static String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\encrypt-decrypt\\employees.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\encrypt-decrypt\\encrypted.csv"));
            String line = br.readLine(); 
            bw.write(line);
            bw.newLine();
            while((line = br.readLine()) != null) {
                String[] d = line.split(",", -1);
                d[3] = encrypt(d[3]);
                bw.write(String.join(",", d));
                bw.newLine();
            }
            br.close();
            bw.close();
            System.out.println("Encryption completed successfully!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
