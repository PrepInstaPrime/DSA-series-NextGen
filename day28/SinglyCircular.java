class CNode{
    int data;
    CNode next;
    public CNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class SinglyCircular {
    CNode head;
    public SinglyCircular(){
        this.head = null;
    }   
    public void insertAtEnd(int data){
        CNode newNode = new CNode(data);
        if(head == null){
            head = newNode;
            head.next = head; // Point to itself to make it circular
            return;
        }
        CNode temp = head;
        while(temp.next != head){ // Traverse until we reach the last node
            temp = temp.next;
        }
        temp.next = newNode; // Point the last node to the new node
        newNode.next = head; // Point the new node back to head to maintain circular structure
    }
    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        CNode temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while(temp != head); // Loop until we come back to head
        System.out.println("(head)");
    }
    public void insertAtBeginning(int data){
        CNode newNode = new CNode(data);
        if(head == null){
            head = newNode;
            head.next = head; // Point to itself to make it circular
            return;
        }
        CNode temp = head;
        while(temp.next != head){ // Traverse until we reach the last node
            temp = temp.next;
        }
        temp.next = newNode; // Point the last node to the new node
        newNode.next = head; // Point the new node to the current head
        head = newNode; // Update head to the new node
    }
    public void delete(int data){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        // If the head node is to be deleted
        if(head.data == data){
            if(head.next == head){ // Only one node in the list
                head = null;
                System.out.println("Element " + data + " deleted from the list");        
                return;
            }
            CNode temp = head;
            while(temp.next != head){ // Traverse to the last node
                temp = temp.next;
            }
            temp.next = head.next; // Point the last node to the second node
            head = head.next; // Update head to the second node
            System.out.println("Element " + data + " deleted from the list");
            return;
        }
        CNode temp = head;
        while(temp.next != head && temp.next.data != data){ // Traverse until we find the node to delete or come back to head
            temp = temp.next;
        }
        if(temp.next != head){ // If we found the node to delete
            temp.next = temp.next.next; // Point the current node to the node after the one to delete
            System.out.println("Element " + data + " deleted from the list");
        }else{
            System.out.println("Element not found in the list");
        }
    }
    public static void main(String[] args) {
        SinglyCircular list = new SinglyCircular();
        list.insertAtEnd(10);
        list.insertAtEnd(20);       
        list.insertAtEnd(30);
        list.display();
        list.insertAtBeginning(5);
        list.display();
        list.delete(20);
        list.display();
    }
}
