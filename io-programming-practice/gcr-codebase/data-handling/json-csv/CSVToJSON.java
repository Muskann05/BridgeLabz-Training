import java.io.*;
public class CSVToJSON {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(
                "C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\json-csv\\students.csv"
            ));
            BufferedWriter bw = new BufferedWriter(new FileWriter(
                "C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\json-csv\\students_new.json"
            ));
            String[] header = br.readLine().split(",");
            bw.write("[\n");
            String line;
            while((line = br.readLine()) != null) {
                String[] data = line.split(",");
                bw.write("  {");
                for(int i = 0; i < data.length; i++) {
                    bw.write("\"" + header[i] + "\":\"" + data[i] + "\"");
                    if (i < data.length - 1) bw.write(",");
                }
                bw.write("},\n");
            }
            bw.write("]");
            br.close();
            bw.close();
            System.out.println("CSV to JSON conversion successful!");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
