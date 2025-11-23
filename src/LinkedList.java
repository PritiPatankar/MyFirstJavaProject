public class LinkedList {

    private Node head;
    private Node tail;
    private int length=0;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public void printList(){
        if(length==0) System.out.println("LinkedList is empty");
        else{
            Node temp = head;
            while(temp!=null){
                System.out.println("Element: "+temp.value);
                //System.out.println(tail);
                temp = temp.next;
            }
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length ==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
}
