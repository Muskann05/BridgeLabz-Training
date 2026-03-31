import java.io.*;
import java.util.Scanner;
public class FileReadingComparison {

    // Read file using FileReader (character stream)
    public static void readWithFileReader(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        int ch;
        while ((ch = fr.read()) != -1) {
            // Reading character by character
        }
        fr.close();
    }

    // Read file using InputStreamReader (byte stream)
    public static void readWithInputStreamReader(String filePath) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
        int ch;
        while ((ch = isr.read()) != -1) {
            // Reading byte by byte and converting to char
        }
        isr.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input file path
        System.out.print("Enter full file path to read: ");
        String filePath = sc.nextLine();

        try {
            // FileReader timing
            long startTime = System.currentTimeMillis();
            readWithFileReader(filePath);
            long endTime = System.currentTimeMillis();
            System.out.println("Time using FileReader: " + (endTime - startTime) + " ms");

            // InputStreamReader timing
            startTime = System.currentTimeMillis();
            readWithInputStreamReader(filePath);
            endTime = System.currentTimeMillis();
            System.out.println("Time using InputStreamReader: " + (endTime - startTime) + " ms");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
