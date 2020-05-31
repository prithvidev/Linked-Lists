
public class length {
    static Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int d){
        data =d;
        next = null;
        }
    }
    public static void main(String[] args){
        //previously adding nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        //connecting nodes
        head.next = second;
        head.next.next= third;
        head.next.next.next=fourth;
        //making an instance of length class
        length ll = new length();
        //display data from linked list
        ll.display(head);
        System.out.println("");
        //length of linked list
        int a = ll.length(head);
        System.out.println("Length of Linked List is:"+" "+a);
        }
    private static void display(Node head){
    Node tempNode = head;
    while(tempNode != null){
    System.out.print(tempNode.data+" ");
    tempNode=tempNode.next;
    }
    }
    private static int length(Node head){
    if(head == null){return 0;}
    int count = 0;
    Node current = head;
    while(current != null){
    count++;
    current = current.next;
    }
    return count;
    
    }
}
