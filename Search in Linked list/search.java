import java.util.Scanner;

/**
 *
 * @author PrithviDevKumar
 */
public class search {
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
        while(tempNode!= null){
            System.out.println(tempNode.data + " ");
            tempNode = tempNode.next;;
        }
    }
    
    //length
    static int length(Node head){
        if(head == null){return 0;}
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    
    //search funtion
    static boolean find(Node head, int key){
        if(head == null){return false;}
        Node current = head;
        while(current != null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    //main method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //adding node previously
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        
        //connecting nodes to each other
        head.next = second;
        head.next.next = third;
        head.next.next.next = fourth;
        
        //creating object of class
        search s = new search();
        
        //diplay linked list
        s.display(head);
        
        //length
        int y = s.length(head);
        
        //search function
        System.out.print("Enter search value:"+" ");
        int q = sc.nextInt();
        Boolean r = s.find(head, q);
        if(r == true){System.out.println("ELEMENT FOUND");}
        else{System.out.println("ELEMENT NOT FOUND");}
    }
}
