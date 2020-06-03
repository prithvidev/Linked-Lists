public class reverse {
    static Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    //display
    static void display(Node head){
        Node tempNode = head;
        while(tempNode != null){
            System.out.println(tempNode.data+" ");
            tempNode = tempNode.next;
        }
    }
    
    //length
    static int length(Node head){
        if(head == null){
            return 0;
        }
        Node current = head;
        int count = 1;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    
    //reverse
    static Node back(Node head){
        if(head == null)
        {return head;}
        
        Node current = head;
        Node next = null;
        Node previous = null;
        
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    
    //main
    public static void main(String[] args){
    
    //adding previous nodes
    Node head = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);
    Node fourth = new Node(40);
    
    //connecting each node to each other
    head.next = second;
    head.next.next = third;
    head.next.next.next = fourth;
    
    //creating an object 
    reverse r = new reverse();
    
    //display the actual linked list
    System.out.println("Linked list before reverse:");
    r.display(head);
    
    //length of linked list
    int y = r.length(head);
    System.out.println("Length of linked list:"+" "+y);
    
    //reverse
    Node rr = r.back(head);
    
    //display after reverse
    System.out.println("Linked list after reverse:");
    r.display(rr);
    }
}
