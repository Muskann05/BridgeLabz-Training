import java.io.*;
public class CSVToReport {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\csv-report\\employees.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\csv-report\\report.csv"));
            String line = br.readLine();
            bw.write("Employee ID,Name,Department,Salary\n");
            while ((line = br.readLine()) != null) {
                bw.write(line + "\n");
            }
            br.close();
            bw.close();
            System.out.println("CSV report generated successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
