class DNode{
    int data;
    DNode next;
    DNode prev;
    public DNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkedList {
    DNode head;
    DNode tail;
    public DoublyLinkedList(){
        this.head = null;
    }
    public void insertAtEnd(int data){
        DNode newNode = new DNode(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void display(){
        DNode temp = head;
        // System.out.println("Forward Traversal:");
        System.out.print("null<-");
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void insertAtBeginning(int data){
        DNode newNode = new DNode(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void delete(int data){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        DNode temp = head;
        while(temp != null && temp.data != data){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Element not found in the list");
            return;
        }
        if(temp.prev != null&& temp.next != null){
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            System.out.println("Element " + data + " deleted from the list");
            return;
        }else if(temp.prev == null){
            head = temp.next; // Deleting the head
            if(head != null){
                head.prev = null;
            }
            System.out.println("Element " + data + " deleted from the list");
            return;
        }else if(temp.next == null){
            tail = temp.prev; // Deleting the tail
            if(tail != null){
                tail.next = null;
            }
            System.out.println("Element " + data + " deleted from the list");
            return;
        }
        System.out.println("Element not found in the list");
      
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();
        list.insertAtBeginning(5);
        list.display();
        list.delete(20);
        list.display();
        list.delete(51);
    }
}
