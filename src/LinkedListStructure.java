public class LinkedListStructure {
  private Node head;
  
  class Node {
    PatientRecord data;
    Node next;
    public Node(PatientRecord data) {
      this.data = data;
      next = null;
    }
  }
  
  // insert
  public void insertRecord(PatientRecord record) {
    Node newNode = new Node(record);
    if (head == null) {
      head = newNode;
      return;
    }
    
    Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
    temp.next = newNode;
  }
  
// search
  public PatientRecord searchRecord(int id) {
    Node temp = head;
    while (temp != null) {
      if (temp.data.getRecordID() == id) {
        return temp.data;
      }
      temp = temp.next;
    }
    return null;
  }
  
// delete
  public void deleteRecord(int id) {
    if (head == null) {
      return;
    }
    
    if (head.data.getRecordID() == id) {
      head = head.next;
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      if (temp.next.data.getRecordID() == id) {
        temp.next = temp.next.next;
        return;
      }
      temp = temp.next;
    }
  }
// traversal
  public void traverseRecords() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}
