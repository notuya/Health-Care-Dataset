public class MainDriver {
    public static void main(String[] args) {
        // 1. Setup Sample Data
        PatientRecord p1 = new PatientRecord(1, 22, "Male", "Flu", "UMD Hospital", "Normal", 500);
        PatientRecord p2 = new PatientRecord(2, 65, "Female", "Heart Attack", "Mercy", "Emergency", 15000);
        PatientRecord p3 = new PatientRecord(3, 40, "Male", "Broken Arm", "City Hospital", "Normal", 2000);
        
        // New Patients
        PatientRecord mike = new PatientRecord(4, 30, "Male", "Fever", "Bowie Health", "Normal", 1200);
        PatientRecord sarah = new PatientRecord(5, 28, "Female", "Sprained Ankle", "UMD Hospital", "Emergency", 3500);
        PatientRecord david = new PatientRecord(6, 45, "Male", "Chest Pain", "Mercy", "Emergency", 9000);
        PatientRecord john = new PatientRecord(7, 50, "Male", "Routine Checkup", "City Hospital", "Normal", 400);

        // --- DYNAMIC ARRAY ---
        System.out.println("=== DYNAMIC ARRAY ===");
        DynamicArray array = new DynamicArray();
        
        long start = System.nanoTime();
        array.insertRecord(p1); array.insertRecord(p2); array.insertRecord(p3);
        array.insertRecord(mike); array.insertRecord(sarah); array.insertRecord(david); array.insertRecord(john);
        System.out.println("Insert Time: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        array.searchRecord(6); // Searching for David
        System.out.println("Search Time: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        array.deleteRecord(1);
        System.out.println("Delete Time: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        array.traverseRecords();
        System.out.println("Traversal Time: " + (System.nanoTime() - start) + " ns\n");

        // --- LINKED LIST ---
        System.out.println("=== LINKED LIST ===");
        LinkedListStructure list = new LinkedListStructure();
        
        start = System.nanoTime();
        list.insertRecord(p1); list.insertRecord(p2); list.insertRecord(p3);
        list.insertRecord(mike); list.insertRecord(sarah); list.insertRecord(david); list.insertRecord(john);
        System.out.println("Insert Time: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        list.searchRecord(6);
        System.out.println("Search Time: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        System.out.println("Delete Time: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        list.traverseRecords();
        System.out.println("Traversal Time: " + (System.nanoTime() - start) + " ns\n");

        // --- HASH MAP ---
        System.out.println("=== HASH MAP ===");
        HashStructure hash = new HashStructure();
        
        start = System.nanoTime();
        hash.insertRecord(p1); hash.insertRecord(p2); hash.insertRecord(p3);
        hash.insertRecord(mike); hash.insertRecord(sarah); hash.insertRecord(david); hash.insertRecord(john);
        System.out.println("Insert Time: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        hash.searchRecord(6);
        System.out.println("Search Time: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        hash.deleteRecord(1);
        System.out.println("Delete Time: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        hash.traverseRecords();
        System.out.println("Traversal Time: " + (System.nanoTime() - start) + " ns\n");

        // --- PRIORITY QUEUE ---
        System.out.println("=== PRIORITY QUEUE (Emergency First) ===");
        PatientPriorityQueue pq = new PatientPriorityQueue();
        pq.insertPatient("Normal", "John");
        pq.insertPatient("Emergency", "Sarah");
        pq.insertPatient("Normal", "Mike");
        pq.insertPatient("Normal", "David");
        pq.processPatients();
    }
}
