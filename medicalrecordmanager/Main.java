package medicalrecordmanager;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        MedicalRecordManager manager = new MedicalRecordManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a new medical record");
            System.out.println("2. Delete a medical record by patient name");
            System.out.println("3. Display all medical records");
            System.out.println("4. Save medical records to a file");
            System.out.println("5. Load medical records from a file");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter date of birth: ");
                    String dob = scanner.nextLine();
                    System.out.print("Enter diagnosis: ");
                    String diagnosis = scanner.nextLine();
                    manager.addRecord(new MedicalRecord(name, dob, diagnosis));
                    break;
                case 2:
                    System.out.print("Enter patient name to delete: ");
                    String deleteName = scanner.nextLine();
                    manager.deleteRecord(deleteName);
                    break;
                case 3:
                    manager.displayRecords();
                    break;
                case 4:
                    System.out.print("Enter filename to save: ");
                    String saveFilename = scanner.nextLine();
                    manager.saveRecordsToFile(saveFilename);
                    break;
                case 5:
                    System.out.print("Enter filename to load: ");
                    String loadFilename = scanner.nextLine();
                    manager.loadRecordsFromFile(loadFilename);
                    break;
                case 6:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}