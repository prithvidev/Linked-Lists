import java.util.Scanner;


public class nthnode {
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
        Node tempNode = head;
        while(tempNode != null){
            System.out.println(tempNode.data+" ");
            tempNode = tempNode.next;
        }
    }
    
    static int length(Node head){
        if(head == null){
            return 0;
        }
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    
    static Node nth(Node head, int n){
        if(head == null){
            return null;
        }
        Node current = head;
        Node main = head;
        int count = 0;
        
        while(count<n){
            count++;
            current = current.next;
        }
        
        while(current != null){
            current = current.next;
            main = main.next;
        }
        return main;
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Creating nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        
        // connecting nodes to each other
        head.next = second;
        head.next.next = third;
        head.next.next.next = fourth;
    
        //creating object of class
        nthnode n = new nthnode();
        
        //display the linked lists
        n.display(head);
        
        //length of linked lists
        int w = n.length(head);
        System.out.println("Length of linked lists:"+w+"");
        
        //nth node of linked lists
        System.out.print("Enter the node index:"+" ");
        int y = sc.nextInt();
        Node r = n.nth(head , y);
        System.out.println("Nth Node from the last is:"+r.data);
        
    }
}
