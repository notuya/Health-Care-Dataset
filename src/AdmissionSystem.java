import java.util.PriorityQueue;
public class AdmissionSystem {
// The queue will now automatically use the compareTo method inside
PatientRecord
private PriorityQueue<PatientRecord> queue = new PriorityQueue<>();
public void admitPatient(PatientRecord r) {
queue.add(r);
}
public PatientRecord processNext() {
// Returns the patient with the highest priority (Emergency
first)
return queue.poll();
}
public void displayQueue() {
for (PatientRecord p : queue) {
System.out.println(p.getRecordID() + " - " +
p.getAdmissionType());
    }
  }
}
