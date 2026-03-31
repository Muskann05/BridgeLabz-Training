import java.io.*;
import java.util.*;

public class ComparisonProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // StringBuilder vs StringBuffer
            int n = 1_000_000;
            String text = "hello";
            // StringBuffer
            long startBuffer = System.nanoTime();
            StringBuffer sbuffer = new StringBuffer();
            for (int i = 0; i < n; i++) {
                sbuffer.append(text);
            }
            long endBuffer = System.nanoTime();
            long bufferTime = endBuffer - startBuffer;
            // StringBuilder
            long startBuilder = System.nanoTime();
            StringBuilder sbuilder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sbuilder.append(text);
            }
            long endBuilder = System.nanoTime();
            long builderTime = endBuilder - startBuilder;

            System.out.println("StringBuffer Time  : " + bufferTime + " ns");
            System.out.println("StringBuilder Time: " + builderTime + " ns");           
            // PART 2: FileReader vs InputStreamReader           
            System.out.print("\nEnter file name: ");
            String fileName = sc.nextLine();

            System.out.println("Enter file content (type 'END' to stop):");
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("END")) {
                    break;
                }
                bw.write(line);
                bw.newLine();
            }
            bw.close();

            //  Using FileReader 
            long startFR = System.nanoTime();
            BufferedReader br1 = new BufferedReader(new FileReader(fileName));
            int wordCountFR = 0;
            String line;

            while ((line = br1.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCountFR += words.length;
            }
            br1.close();
            long endFR = System.nanoTime();

            //  Using InputStreamReader 
            long startISR = System.nanoTime();
            BufferedReader br2 = new BufferedReader(
                    new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            int wordCountISR = 0;

            while ((line = br2.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCountISR += words.length;
            }
            br2.close();
            long endISR = System.nanoTime();

            System.out.println("\nFileReader Word Count      : " + wordCountFR);
            System.out.println("FileReader Time           : " + (endFR - startFR) + " ns");

            System.out.println("\nInputStreamReader Word Count: " + wordCountISR);
            System.out.println("InputStreamReader Time     : " + (endISR - startISR) + " ns");

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}
