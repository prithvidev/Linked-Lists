public class duplicate {
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
    
    static void duplicate(Node head){
        if(head == null){
            return;
        }
        Node current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }
    
    public static void main(String[] args){
        //previously creating nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(20);
        Node fourth = new Node(30);
        
        //connecting nodes
        head.next = second;
        head.next.next = third;
        head.next.next.next = fourth;
        
        //creating class object
        duplicate d = new duplicate();
        
        //display
        d.display(head);
        
        //length
        int y = d.length(head);
        System.out.println("Length of linked lists is:"+y);
        
        //duplicate
        d.duplicate(head);
        
        //display after removing duplicates
        d.display(head);
        
        //length after removing duplicates
        int w = d.length(head);
        System.out.println("Length after removing duplicates:"+w);
    }
}
