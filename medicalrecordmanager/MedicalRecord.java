package medicalrecordmanager;

class MedicalRecord {
    private String patientName;
    private String dateOfBirth;
    private String diagnosis;

    public MedicalRecord(String patientName, String dateOfBirth, String diagnosis) {
        this.patientName = patientName;
        this.dateOfBirth = dateOfBirth;
        this.diagnosis = diagnosis;
    }

    public String getPatientName() {
        return patientName;
    }

    @Override
    public String toString() {
        return "Patient Name: " + patientName + ", Date of Birth: " + dateOfBirth + ", Diagnosis: " + diagnosis;
    }
}


