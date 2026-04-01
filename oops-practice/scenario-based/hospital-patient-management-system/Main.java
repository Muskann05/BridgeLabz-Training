public class Main {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(1, "Dr. Sharma", "Cardiology");

        Patient p1 = new InPatient(101, "Muskan", 22, d1, 5, 2000);
        Patient p2 = new OutPatient(102, "Muskiii", 22, d1, 500);

        HospitalManagement hm = new HospitalManagement();

        hm.addPatient(p1);
        hm.addPatient(p2);

        System.out.println("All Patients:");
        hm.displayPatients();

        hm.removePatient(101);

        System.out.println("After Deletion:");
        hm.displayPatients();
    }
}
