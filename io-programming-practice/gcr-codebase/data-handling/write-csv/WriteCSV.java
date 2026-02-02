import java.io.*;
public class WriteCSV {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\write-csv\\employees.csv"));
            bw.write("ID,Name,Department,Salary\n");
            bw.write("1,Alice,IT,50000\n");
            bw.write("2,Bob,HR,45000\n");
            bw.write("3,Charlie,Finance,60000\n");
            bw.write("4,David,IT,55000\n");
            bw.write("5,Eva,Marketing,48000\n");
            bw.close();
            System.out.println("CSV file created successfully!");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
