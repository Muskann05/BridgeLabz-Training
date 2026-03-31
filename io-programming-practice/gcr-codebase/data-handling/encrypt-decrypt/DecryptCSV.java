import java.io.*;
import java.util.Base64;
public class DecryptCSV {
    public static String decrypt(String data) {
        return new String(Base64.getDecoder().decode(data));
    }
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\encrypt-decrypt\\encrypted.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\encrypt-decrypt\\decrypted.csv"));
            String line = br.readLine(); 
            bw.write(line);
            bw.newLine();
            while((line = br.readLine()) != null) {
                String[] d = line.split(",", -1);
                d[3] = decrypt(d[3]);
                bw.write(String.join(",", d));
                bw.newLine();
            }
            br.close();
            bw.close();
            System.out.println("Decryption completed successfully!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
