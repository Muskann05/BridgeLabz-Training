import java.util.*;
public class License {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Plate Number");
		String plateNumber = sc.nextLine();
		String regex = "^[A-Z]{2}[0-9]{4}$";
		if(plateNumber.matches(regex)) {
            System.out.println("Valid");
        } else{
            System.out.println("Invalid");
        }
				
	}	

}
