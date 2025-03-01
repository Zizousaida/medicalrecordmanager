package medicalrecordmanager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

class MedicalRecordManager {
    private List<MedicalRecord> records;

    public MedicalRecordManager() {
        records = new ArrayList<>();
    }

    public void addRecord(MedicalRecord record) {
        records.add(record);
    }

    public void deleteRecord(String patientName) {
        records.removeIf(record -> record.getPatientName().equals(patientName));
    }

    public void displayRecords() {
        for (MedicalRecord record : records) {
            System.out.println(record);
        }
    }

    public void saveRecordsToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(records);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void loadRecordsFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            records = (List<MedicalRecord>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}