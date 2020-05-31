import java.util.Scanner;

public class insertatbeg {
    static Node head;
    static class Node{
    int data;
    Node next;
    
    Node(int d){
    data = d;
    next = null;
    }
    }
    
    public Node begining(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
        return newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //creating previous node
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        
        //connecting Nodes
        head.next = second;
        head.next.next = third;
        head.next.next.next = fourth;
        
        //creating object of class
        insertatbeg qw = new insertatbeg();
        //display linked list before insertion
        qw.display(head);
        //length of linked list
        int a = qw.length(head);
        System.out.println("Length of the linked list before insertion:"+" "+a);
        System.out.print("ENTER VALUE : "+ " ");
        int dq = sc.nextInt();
        //insert at begining
        Node newNode = qw.begining(head, dq);
        //display linked list after insertion
        qw.display(newNode);
        //length of linked list after insertion
        int b = qw.length(newNode);
        System.out.println("Length of the linked list after insertion:"+" "+b);      
    }
    
    
    private static void display(Node head){
    Node tempnode = head;
    while(tempnode != null){
    System.out.println(tempnode.data+"");
    tempnode = tempnode.next;
    }
    }
    private static int length(Node head){
    if(head == null){
    return 0;
    }
    int count=0;
    Node current = head;
    while(current != null){
    count++;
    current = current.next;
    }
    return count;
    }
}
