import java.io.*;
import java.util.Scanner;
public class ByteToCharStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Get file name
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();
            // Write binary data to file
            System.out.println("Enter file content (type 'END' to stop):");
            FileOutputStream fos = new FileOutputStream(fileName);
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("END")) {
                    break;
                }
                fos.write(line.getBytes("UTF-8"));
                fos.write('\n');
            }
            fos.close();
            // Read using InputStreamReader
            System.out.println("\nReading file using InputStreamReader:");
            FileInputStream fis = new FileInputStream(fileName);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            isr.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
