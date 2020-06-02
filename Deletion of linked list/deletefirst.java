
public class deletefirst {
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
    static Node delete(Node head){
        if(head == null){
        return head;
        }
        Node del = head;
        head = head.next;
        del.next = null;
        return del;
    }
    public static void main(String[] args){
    //adding previous nodes
    Node head = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);
    Node fourth = new Node(40);
    
    // connecting nodes to each other
    head.next = second;
    head.next.next = third;
    head.next.next.next = fourth;
    
    //creating object of class
    deletefirst de = new deletefirst();

    //display linked lists
    de.display(head);
    
    //length of linked list before deleting head node
    int q = de.length(head);
    System.out.println("Length of linked list before deletion:"+" "+q);
    
    //deleting first node
    Node first = de.delete(head);
    System.out.println("Deleted Node:"+" "+first.data);
    
    //display linked list after deletion
    de.display(second);
    
    //length of linked lists after deleting head node
    int w = de.length(head);
    System.out.println("Length of linked lists after deletion:"+" "+w);
    }
}
