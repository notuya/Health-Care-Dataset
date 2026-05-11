public class PatientRecord {

    private int recordID;
    private int age;
    private String gender;
    private String medicalCondition;
    private String hospital;
    private String admissionType;
    private double billingAmount;

    public PatientRecord(int recordID, int age, String gender, String medicalCondition, String hospital, String admissionType,
        double billingAmount) {

        this.recordID = recordID;
        this.age = age;
        this.gender = gender;
        this.medicalCondition = medicalCondition;
        this.hospital = hospital;
        this.admissionType = admissionType;
        this.billingAmount = billingAmount;
    }

    public int getRecordID() {
        return recordID;
    }

    public String getAdmissionType() {
        return admissionType;
    }

    public String toString() {

        return "ID: " + recordID +
                " Age: " + age +
                " Gender: " + gender +
                " Condition: " + medicalCondition +
                " Hospital: " + hospital +
                " Admission: " + admissionType +
                " Billing: $" + billingAmount;
    }
}

//Can explain
