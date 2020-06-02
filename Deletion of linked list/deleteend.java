
public class deleteend {
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
    static Node lastdel(Node head){
        if(head == null){
        return head;}
        Node move = head;
        Node del = null;
        while(move.next != null){
        del = move;
        move = move.next;
        }
        del.next = null;
        return move;
    }
    public static void main(String[] args){
    //previously adding nodes
    Node head = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);
    Node fourth = new Node(40);
    
    //connecting nodes
    head.next = second;
    head.next.next = third;
    head.next.next.next = fourth;
    
    //creating object of a class
    deleteend del = new deleteend();
    
    //display linked list before deletion
    del.display(head);
    
    //length of linked list before deletion
    int q = del.length(head);
    System.out.println("Length of node before deletion:"+" "+q);
    
    //deletion process...
    Node end = del.lastdel(head);
    System.out.println("DELETED NODE IS:"+end.data);
    
    //display linked list after deletion
    del.display(head);
    
    //length of linked list after deletion
    int q1 = del.length(head);
    System.out.println("Length of node before deletion:"+" "+q1);
    }
}
