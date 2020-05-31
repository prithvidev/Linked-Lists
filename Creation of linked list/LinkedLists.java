package linked.lists;

import java.util.*;

/** 
 Linked Lists Implementation.
 **/

public class LinkedLists {

    Node head;
    
    static class Node{
    int data;
    Node next;
    Node(int d){
    data = d;
    next = null;
    }
    }
    public static void main(String[] args) {
       //creating linked list.
       LinkedLists l = new LinkedLists();
       //adding nodes.
       l.head=new Node(10);
       Node second = new Node(20);
       Node third = new Node(30);
       Node fourth = new Node(40);
       //connecting nodes.
       l.head.next=second;
       l.head.next.next=third;
       l.head.next.next.next=fourth;
       l.Linkedlist();
       
    }
    //used to display the Linked list
    private void Linkedlist(){
    Node tempNode=head;
    while(tempNode!=null){
    System.out.println(tempNode.data+" ");
    tempNode=tempNode.next;
    }
    }
}
