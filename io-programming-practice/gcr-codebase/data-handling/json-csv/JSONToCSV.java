import java.io.*;
import java.nio.file.*;
public class JSONToCSV {
    public static void main(String[] args) {
        try {
            String json = new String(Files.readAllBytes(Paths.get(
                "C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\json-csv\\students.json"
            )));
            BufferedWriter bw = new BufferedWriter(new FileWriter(
                "C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\json-csv\\students.csv"
            ));
            bw.write("ID,Name,Age,Marks\n");
            json = json.replace("\n", "").replace("\r", "");
            String[] records = json.split("\\},\\s*\\{");
            for(String record : records) {
                record = record.replace("[", "").replace("]", "")
                               .replace("{", "").replace("}", "")
                               .replace("\"", "").trim();
                String[] fields = record.split(",");

                String id = fields[0].split(":")[1];
                String name = fields[1].split(":")[1];
                String age = fields[2].split(":")[1];
                String marks = fields[3].split(":")[1];

                bw.write(id + "," + name + "," + age + "," + marks + "\n");
            }

            bw.close();
            System.out.println("JSON to CSV conversion successful!");

        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
