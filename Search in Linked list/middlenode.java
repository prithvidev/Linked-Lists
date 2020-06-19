import java.util.Scanner;


public class middlenode {
    Node head;
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
    
    static Node middle(Node head){
        if(head == null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //creating previous node
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        
        //connecting Nodes
        head.next = second;
        head.next.next = third;
        head.next.next.next = fourth;
        head.next.next.next.next = fifth;
        
        //creating object of class
        middlenode m = new middlenode();
        
        //displaying the linked lists
        m.display(head);
        
        //length of linked lists
        int y = m.length(head);
        System.out.println("Length of linked lists:"+y+"");
        
        //middle Node of linked lists
        Node qw = m.middle(head);
        System.out.println("Middle Node is:"+qw.data);
    }
}
