import java.util.Scanner;
public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utility utility = new Utility();
        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();
        String transportId = input.split(":")[0];
        if (!utility.validateTransportId(transportId)) {
            return;
        }
        GoodTransport goodTransport = utility.parseDetails(input);
        String type = utility.findObjectType(goodTransport);
        System.out.println();
        System.out.println("Transporter id : " + goodTransport.getId());
        System.out.println("Date of transport : " + goodTransport.getDate());
        System.out.println("Rating of the transport : " + goodTransport.getRating());
        if (type.equals("BrickTransport")) {
            BrickTransport bt = (BrickTransport) goodTransport;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
        } else if (type.equals("TimberTransport")) {
            TimberTransport tt = (TimberTransport) goodTransport;
            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
        }

        System.out.println("Vehicle for transport : " + goodTransport.vehicleSelection());
        System.out.println("Total charge : " + goodTransport.calculateTotalCharge());
    }
}
