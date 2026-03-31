import java.io.*;
public class ReadInputWriteToFile{
    public static void main(String[] args) {
        try {
            // Read input from console
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            // Write to file
            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                bw.write(line);
                bw.newLine();
            }
            // Close resources
            bw.close();
            fw.close();
            br.close();
            isr.close();

            System.out.println("Data successfully written to output.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
