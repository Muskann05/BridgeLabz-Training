import java.time.LocalDate;
import java.util.Scanner;

public class GlobalShipment {
    public static boolean validateRecord(String record) {
        String[] parts = record.split("\\|");
        if(parts.length != 5)
            return false;
        String code = parts[0];
        String date = parts[1];
        String mode = parts[2];
        String weight = parts[3];
        String status = parts[4];
        if(!code.startsWith("SHIP-"))
            return false;
        String digits = code.substring(5);
        if(digits.length() != 6)
            return false;
        if(digits.charAt(0) == '0')
            return false;
        for(int i=0;i<digits.length();i++){
            if(!Character.isDigit(digits.charAt(i)))
                return false;
        }
        int count = 1;
        for(int i=1;i<digits.length();i++){
            if(digits.charAt(i) == digits.charAt(i-1)){
                count++;
                if(count > 3)
                    return false;
            }
            else{
                count = 1;
            }
        }
        try{

            String[] d = date.split("-");

            int year = Integer.parseInt(d[0]);
            int month = Integer.parseInt(d[1]);
            int day = Integer.parseInt(d[2]);

            if(year < 2000 || year > 2099)
                return false;

            LocalDate.of(year,month,day);

        }
        catch(Exception e){
            return false;
        }
        if(!(mode.equals("AIR") ||
             mode.equals("SEA") ||
             mode.equals("ROAD") ||
             mode.equals("RAIL") ||
             mode.equals("EXPRESS") ||
             mode.equals("FREIGHT")))
            return false;

        int dot = 0;
        for(int i=0;i<weight.length();i++){
            char c = weight.charAt(i);
            if(c == '.'){
                dot++;
                if(dot > 1)
                    return false;
            }
            else if(!Character.isDigit(c))
                return false;
        }
        if(weight.startsWith("0") && weight.length()>1 && weight.charAt(1)!='.')
            return false;

        try{
            double w = Double.parseDouble(weight);
            if(w <= 0 || w > 999999.99)
                return false;
        }
        catch(Exception e){
            return false;
        }
        if(weight.contains(".")){
            int decimal = weight.length() - weight.indexOf('.') - 1;
            if(decimal > 2)
                return false;
        }

        // Delivery Status 
        if(!(status.equals("DELIVERED") ||
             status.equals("CANCELLED") ||
             status.equals("IN_TRANSIT")))
            return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String record = sc.nextLine();
            if(validateRecord(record))
                System.out.println("COMPLIANT RECORD");
            else
                System.out.println("NON-COMPLIANT RECORD");
        }
        sc.close();
    }
}