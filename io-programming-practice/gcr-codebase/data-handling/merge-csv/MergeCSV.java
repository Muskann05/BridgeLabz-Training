import java.io.*;
import java.util.*;
public class MergeCSV {
    public static void main(String[] args) {
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\merge-csv\\students1.csv"));
            BufferedReader br2 = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\merge-csv\\students2.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\merge-csv\\merged.csv"));
            Map<String, String[]> map = new HashMap<>();
            String line = br1.readLine();
            while((line = br1.readLine()) != null) {
                String[] d = line.split(",");
                map.put(d[0], d);
            }
            bw.write("ID,Name,Age,Marks,Grade\n");
            br2.readLine(); 
            while((line = br2.readLine()) != null) {
                String[] d2 = line.split(",");
                if(map.containsKey(d2[0])) {
                    String[] d1 = map.get(d2[0]);
                    bw.write(d1[0] + "," + d1[1] + "," + d1[2] + "," + d2[1] + "," + d2[2] + "\n");
                }
            }
            br1.close();
            br2.close();
            bw.close();
            System.out.println("Merged CSV created!");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
