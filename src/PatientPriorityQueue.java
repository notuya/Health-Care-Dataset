import java.util.PriorityQueue;
public class PatientPriorityQueue {

    private PriorityQueue<String> queue;
    public PatientPriorityQueue() {

        queue = new PriorityQueue<>();
    }

    // INSERT PATIENT
    public void insertPatient(String patientType, String patientName) {

        // Emergency patients get E
        // Normal patients get N
        if (patientType.equals("Emergency")) {
            queue.add("E -> " + patientName);
        }
        else {
            queue.add("N -> " + patientName);
        }
    }
    // PROCESS PATIENTS
    public void processPatients() {
        while (!queue.isEmpty()) {
            String patient = queue.poll();
            System.out.println(patient);
        }
    }
}
