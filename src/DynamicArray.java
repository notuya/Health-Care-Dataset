public class DynamicArray {

    private PatientRecord[] records;
    private int count;

    public DynamicArray() {
        // fixed size array
        records = new PatientRecord[1000];
        count = 0;
    }

    // INSERT
    public void insertRecord(PatientRecord patient) {
        records[count] = patient;
        count++;
    }

    // SEARCH
    public PatientRecord searchRecord(int id) {
        for (int i = 0; i < count; i++) {
            if (records[i].getRecordID() == id) {
                return records[i];
            }
        }
        return null;
    }

    // DELETE
    public void deleteRecord(int id) {
        for (int i = 0; i < count; i++) {
            if (records[i].getRecordID() == id) {
                // shift elements left
                for (int j = i; j < count - 1; j++) {
                records[j] = records[j + 1];
            }
                count--; // Correctly updates the size after shifting
                break;
            }
        }
    }
    // TRAVERSE
    public void traverseRecords() {
        for (int i = 0; i < count; i++) {
            System.out.println(records[i]);
        }
    }
}
