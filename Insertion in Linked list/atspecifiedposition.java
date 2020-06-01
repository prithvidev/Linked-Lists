import java.util.Scanner;



public class atspecifiedposition {
    static Node head;
static class Node{
int data;
Node next;

Node(int d){
data = d;
next = null;
}
}
    static void display(Node head){
    Node tempnode = head;
    while(tempnode != null){
    System.out.println(tempnode.data+"");
    tempnode = tempnode.next;
    }
    }
    static int length(Node head){
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
    static Node atposition(Node head,int data, int position){
        int size = length(head);
        
        if(position >size -1 || position<1){
        System.out.println("INVALID POSITION");
        return head;
        }
        Node newNode = new Node(data);
        if(position == 1){
        newNode.next =head;
        return head;
        }
        else{
        Node previous = head;
        int count = 1;
        while(count<position - 1){
        previous = previous.next;
        count++;
        }
        Node current = previous.next;
        newNode.next = current;
        previous.next = newNode;
        return head;
        }
        
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
        atspecifiedposition qw = new atspecifiedposition();
        //display linked list before insertion
        qw.display(head);
        //length of linked list
        int a = qw.length(head);
        System.out.println("Length of the linked list before insertion:"+" "+a);
        System.out.print("ENTER VALUE : "+ " ");
        int dq = sc.nextInt();
        System.out.print("ENTER POSITION : "+ " ");
        int pos = sc.nextInt();
        //insert at position
        qw.atposition(head, dq, pos );
        //display linked list after insertion
        qw.display(head);
        //length of linked list after insertion
        int b = qw.length(head);
        System.out.println("Length of the linked list after insertion:"+" "+b);   
    }
}
