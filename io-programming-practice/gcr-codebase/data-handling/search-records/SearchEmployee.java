import java.io.*;
import java.util.Scanner;
public class SearchEmployee {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name: ");
            String searchName = sc.nextLine();
            BufferedReader br = new BufferedReader(new FileReader(
                "C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\search-records\\employees.csv"
            ));
            String line;
            br.readLine(); 
            boolean found = false;
            while((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if(data[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + data[2] + ", Salary: " + data[3]);
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.out.println("Employee not found!");
            }

            br.close();
            sc.close();

        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
