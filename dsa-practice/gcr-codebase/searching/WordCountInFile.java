import java.io.*;
import java.util.Scanner;

public class WordCountInFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // File name
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();
            // Write content to file
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
            // Word to search
            System.out.print("Enter word to count: ");
            String targetWord = sc.next();
            // Read file and count word occurrences
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            int count = 0;
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
            br.close();
            fr.close();
            // Step 5: Output result
            System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
