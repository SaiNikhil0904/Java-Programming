import java.util.Scanner;

class PatientBilling {
    String name, address, staff, treatment;
    char bloodGroup;
    int age;
    double bill = 0.0, discountAmount, bloodCharge, treatmentCharge, totalBeforeDiscount;

    void patientDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter patient's name: ");
        name = sc.nextLine();
        System.out.print("Enter patient's address: ");
        address = sc.nextLine();
        System.out.print("Enter patient's assigned staff: ");
        staff = sc.nextLine();
        System.out.print("Enter patient's age: ");
        age = sc.nextInt();
        System.out.print("Enter patient's blood group (O, A, B, AB): ");
        bloodGroup = sc.next().charAt(0);
    }

    void bloodNeed() {
        switch (Character.toUpperCase(bloodGroup)) {
            case 'O': bill += 2000; break;
            case 'A': bill += 2100; break;
            case 'B': bill += 2200; break;
            case 'A' + 'B': bill += 2500; break;
            default: System.out.println("Invalid Blood Group");
        }
        bloodCharge = bill;
    }

    void treatment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the patient's treatment:\n1) Minor Surgery\n2) Major Surgery\n3) Vaccine Therapy\n4) Chemotherapy");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: treatment = "Minor Surgery"; bill += 50000; break;
            case 2: treatment = "Major Surgery"; bill += 100000; break;
            case 3: treatment = "Vaccine Therapy"; bill += 3000; break;
            case 4: treatment = "Chemotherapy"; bill += 200000; break;
            default: System.out.println("Invalid Choice!");
        }
        treatmentCharge = bill - bloodCharge;
        totalBeforeDiscount = bill;
    }

    void discount() {
        discountAmount = bill * (age > 60 ? 0.50 : age >= 40 ? 0.30 : age >= 20 ? 0.20 : 0.10);
        bill -= discountAmount;
    }

    void showPatient() {
        System.out.println("\nPatient Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Assigned Staff: " + staff);
    }

    void showBill() {
        System.out.println("\nBilling Details:");
        System.out.println("Bill for Blood Need: ₹" + bloodCharge);
        System.out.println("Bill for Treatment: ₹" + treatmentCharge);
        System.out.println("Total Bill (Before Discount): ₹" + totalBeforeDiscount);
        System.out.println("Discount Applied: ₹" + discountAmount);
        System.out.println("Final Bill: ₹" + bill);
    }

    public static void main(String args[]) {
        PatientBilling patient = new PatientBilling();
        patient.patientDetails();
        patient.bloodNeed();
        patient.treatment();
        patient.discount();
        patient.showPatient();
        patient.showBill();
    }
}