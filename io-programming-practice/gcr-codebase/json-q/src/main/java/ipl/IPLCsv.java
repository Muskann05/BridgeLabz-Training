package ipl;
import java.io.*;
public class IPLCsv {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\json-q\\src\\main\\java\\ipl\\ipl.csv"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\json-q\\src\\main\\java\\ipl\\ipl_censored.csv"));
        String line;
        boolean isHeader = true;
        while((line = reader.readLine()) != null) {
            if(isHeader) {
                writer.write(line); 
                writer.newLine();
                isHeader = false;
                continue;
            }
            String[] data = line.split(",");
            // Mask team names
            data[1] = maskTeam(data[1]);
            data[2] = maskTeam(data[2]);
            data[5] = maskTeam(data[5]);
            // Redact player of match
            data[6] = "REDACTED";
            writer.write(String.join(",", data));
            writer.newLine();
        }
        reader.close();
        writer.close();
        System.out.println("✅ Censored CSV file created.");
    }
    public static String maskTeam(String teamName) {
        String[] parts = teamName.split(" ");
        if(parts.length > 1) {
            return parts[0] + " ***";
        }
        return "***";
    }
}
