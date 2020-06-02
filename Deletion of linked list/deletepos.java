import java.util.Scanner;

public class deletepos {
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
    Node tempNode = head;
    while(tempNode != null){
        System.out.println(tempNode.data+"");
        tempNode = tempNode.next;
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
    static Node position(Node head, int pos)
    {
    int size= length(head);
    if(pos > size+1 || pos < 1){
    System.out.println("Invalid posiiton");
    }
    Node previous = head;
    int count=1;
    while(count<pos -1){
        count++;
        previous = previous.next;
    }
    Node current = previous.next;
    previous.next = current.next;
    current.next = null;
    return current;
    }
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
    // adding previous nodes
    Node head = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);
    Node fourth = new Node(40);
    
    //connecting nodes to each other
    head.next = second;
    head.next.next = third;
    head.next.next.next = fourth;
    
    //creating object of class
    deletepos del = new deletepos();
    
    //display linked list before deletion
    del.display(head);
    
    //length of the linked list before deletion
    int q = del.length(head);
    System.out.println("Length of linked list before deletion:"+" "+q);
    
    //deletion process...
    System.out.print("ENTER POSITION:");
    int p = sc.nextInt();
    Node del1 =  del.position(head,p);
    System.out.println("DELETED NODE IS:"+" "+del1.data);
    //displaying node after deletion
    del.display(head);
    
    //length of linked list after deletion
    int y = del.length(head);System.out.println("Length of linked list after deletion:"+" "+y);
    }
}
