class Patient {

    // Static
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    // Instance variables
    String name;
    int age;
    String ailment;

    //  Final 
    final String patientID;

    // Constructor 
    Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static Method 
    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    //Display
    void displayPatientDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}

//  Main Class 
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient(
                "P001",
                "Lathika",
                30,
                "Flu"
        );
        Patient p2 = new Patient(
                "P002",
                "Lidiya",
                45,
                "Fracture"
        );

        // Display total patients
        Patient.getTotalPatients();

        //  instanceof 
        if (p1 instanceof Patient) {
            p1.displayPatientDetails();
        }
        if (p2 instanceof Patient) {
            p2.displayPatientDetails();
        }
    }
}
