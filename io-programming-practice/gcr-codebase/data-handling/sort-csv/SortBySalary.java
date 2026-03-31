import java.io.*;
import java.util.*;
public class SortBySalary {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\sort-csv\\employees.csv"));
            List<String[]> list = new ArrayList<>();
            String header = br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line.split(","));
            }
            br.close();
            Collections.sort(list, (a, b) -> Integer.parseInt(b[3]) - Integer.parseInt(a[3]));
            for(int i = 0; i < Math.min(5, list.size()); i++) {
                System.out.println(String.join(",", list.get(i)));
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
