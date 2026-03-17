class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class SinglyList{
        Node head;
        public SinglyList(){
            this.head = null;
        }
        public void insertAtEnd(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public void insertAtBeginning(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        public void delete(int data){
            // if the list is empty
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            if(head.data == data){
                head = head.next;
                System.out.println("Element " + data + " deleted from the list");
                return;
            }
            Node temp = head;
            while(temp.next != null && temp.next.data != data){
                temp = temp.next;
            }
            if(temp.next != null){
                temp.next = temp.next.next;
                System.out.println("Element " + data + " deleted from the list");
            }else{
                System.out.println("Element not found in the list");
                return;
            }
        }
        public void update(int oldData, int newData){
            Node temp = head;
            while(temp != null){
                if(temp.data == oldData){
                    temp.data = newData;
                    System.out.println("Element " + oldData + " updated to " + newData);
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Element not found in the list");
        }
    public static void main(String[] args) {
        SinglyList list = new SinglyList();
        // System.out.println(list.head);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.display();
        list.insertAtBeginning(5);
        list.display();
        list.delete(30);
        list.display();
        list.delete(5);
        list.delete(50);
        list.display();
        list.update(20, 25);
        list.display();
    }
}