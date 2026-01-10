public class OutPatient extends Patient implements IPayable {
    private double consultationFee;

    public OutPatient(int id, String name, int age, Doctor doctor, double fee) {
        super(id, name, age, doctor);
        this.consultationFee = fee;
    }
   
    public double calculateBill() {
        return consultationFee;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: OutPatient");
        System.out.println("Total Bill: " + calculateBill());
    }
}
