// inherit the class of Ipayable
public class InPatient extends Patient implements IPayable {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, Doctor doctor,
                     int daysAdmitted, double dailyCharge) {
        super(id, name, age, doctor);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: InPatient");
        System.out.println("Total Bill: " + calculateBill());
    }
}
