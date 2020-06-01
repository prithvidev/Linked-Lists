import java.util.Scanner;

public class insertatend {
    static Node head;
    static class Node{
    int data;
    Node next;
    
    Node(int d){
    data =d;
    next = null;
    }
    }
  static void display(Node head){
  Node tempnode = head;
  while(tempnode != null){
  System.out.println(tempnode.data+" ");
  tempnode = tempnode.next;
  }
  }
  static int length(Node head){
  if(head == null){
  return 0;
  }
  int count = 0;
  Node current = head;
  while(current != null){
  count++;
  current = current.next;
  }
  return count;
  }
  static Node end(Node head, int data){
      Node newNode = new Node(data);
      Node curr = head;
      if(head == null){
           return newNode;
      }
      while(null != curr.next){
          curr = curr.next;
      }
      curr.next = newNode;
        return head;
  }
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  //creating previously added elements
  Node head = new Node(10);
  Node second = new Node(20);
  Node third = new Node(30);
  Node fourth = new Node(40);
  
  //connecting Nodes to each other
  head.next = second;
  head.next.next = third;
  head.next.next.next = fourth;
  
  // creating object of class
  insertatend oo = new insertatend();
  //display before adding element at the end
  oo.display(head);
  //length before adding element at the end
  int l = oo.length(head);
  System.out.println("Lnegth of Linked List before adding end Node:"+" "+l);
  //adding element int he linked list
  System.out.print("ENTER NEW VALUE:");
  int q = sc.nextInt();
  oo.end(head,q);
  //display after adding end node
  oo.display(head);
  //length after adding end node
  int l2 = oo.length(head);
  System.out.println("Length of Linked List after adding end Node:"+" "+l2);
  }
}

