import java.util.Scanner;
public class IPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter IP address:");
        String ip = sc.nextLine();
        String regex = "\\b((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}"
                     + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\b";
        if(ip.matches(regex)) {
            System.out.println("Valid IP Address");
        } else{
            System.out.println("Invalid IP Address");
        }
    }
}
