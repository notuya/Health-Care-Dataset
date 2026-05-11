import java.util.HashMap;

public class HashStructure {
  private HashMap<Integer, PatientRecord> map;
  public HashStructure() {
    map = new HashMap<>();
  }
  
// insert
  public void insertRecord(PatientRecord record) {
    map.put(record.getRecordID(), record);
  }
  
// search
  public PatientRecord searchRecord(int id) {
    return map.get(id);
  }
  
// delete
  public void deleteRecord(int id) {
    map.remove(id);
  }
  
// traversal
  public void traverseRecords() {
    for (PatientRecord record : map.values()) {
      System.out.println(record);
    }
  }
}
