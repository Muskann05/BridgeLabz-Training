import java.io.*;
public class UpdateSalary {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\modify-csv\\employees.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\modify-csv\\updated_employees.csv"));
            String line = br.readLine();
            bw.write(line + "\n");
            while((line = br.readLine()) != null) {
                String[] d = line.split(",");
                if(d[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(d[3]);
                    salary = salary + (salary * 0.10);
                    d[3] = String.valueOf((int) salary);
                }
                bw.write(String.join(",", d) + "\n");
            }
            br.close();
            bw.close();
            System.out.println("Updated CSV created!");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
