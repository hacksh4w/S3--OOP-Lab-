// (A) Create a doubly linked list

import java.io.*;
import java.util.*;

public class DoublyLinkedList{
  Node head;
  static class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  void InsertF(int d){
    Node n = new Node(d);
    if (head==null){
      head = n;
    }
    else{
      n.next = head;
      head.prev = n;
      head = n;
    }
  }

  void InsertB(int d){
    Node n = new Node(d);
    if (head == null){
      head = n;
    }
    else{
      Node ptr = head;
      while(ptr.next!=null){
        ptr = ptr.next;
      }
      ptr.next = n;
      n.prev = ptr;
    }
  }

  void InsertAfter(int d, int v){
    Node n = new Node(d);
    int f = 0;
    if (head == null){
      System.out.println("Empty!");
    }
    else{
      Node ptr = head;
      while (ptr!=null){
        if (ptr.data == v){
          f = 1;
          n.next = ptr.next;
          ptr.next.prev = n;
          ptr.next = n;
          n.prev = ptr;
        }
        ptr = ptr.next;
      }
      if (f==0){
        System.out.println("Node not found!");
      }
    }
  }

  void delete(int val){
    int c, f = 0;
    if (head == null){
      System.out.println("Empty!");
      return;
    }
    if(head.data == val){
      c = head.data;
      if (head.next!=null){
        Node temp = head;
        head=head.next; 
        temp.next=null; 
        head.prev=null;
      } 
      else{ 
        head=null; 
      } 
      System.out.println("deleted:"+c); 
    } 
    else{ 
      Node n=head; 
      while(n.next!=null){ 
        if(n.next.data==val){ 
          f=1; 
          Node temp=n.next; 
          c=temp.data; 
          if(temp.next==null){ 
            temp.prev=null; 
            n.next=null; 
          } 
          else { 
            n.next=temp.next; 
            temp.next.prev=n; 
            temp.prev=null; 
            temp.next=null; 
          } 
          System.out.println("deleted:"+c); 
          break; 
        } 
        n=n.next; 
      } 
      if(f==0) 
        System.out.println("\n node not found!!\n"); 
    } 
  }
  
  void display(){ 
    if(head==null){ 
      System.out.println("Empty!!");
    } 
    else { 
      Node cur=head; 
      while(cur!=null){ 
        System.out.print(cur.data + " <-> "); 
        cur=cur.next; 
      } 
      System.out.println("X"); 
    } 
}

    public static void main(String[] args)throws NumberFormatException, IOException{
        int val,ch;
        DoublyLinkedList dll=new DoublyLinkedList();
        
        do{ 
          System.out.print("\n1:INSERT AT BEGIN\t2:INSERT AT END\t3:INSERt IN BETWEEN\t4:DELETE BY VALUE\t5:DISPLAY\t6:EXIT\n"); 
          System.out.print("Enter your choice:");
          BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
          ch=Integer.parseInt(br.readLine());
            switch(ch) {
                          case 1: 
                  System.out.print("Enter the data:"); 
                  val=Integer.parseInt(br.readLine());
                  dll.InsertF(val); 
                  break; 
                case 2: 
                  System.out.print("Enter the data:"); 
                  val=Integer.parseInt(br.readLine()); 
                  dll.InsertB(val); 
                  break; 
                case 3: 
                  System.out.print("Value to insert:"); 
                  val=Integer.parseInt(br.readLine());
                  System.out.print("Enter the node after which insertion should take place:"); 
                  int newval=Integer.parseInt(br.readLine()) ;
                  dll.InsertAfter(val,newval); 
                  break;
                case 4: 
                  System.out.print("Enter the data:"); 
                  val=Integer.parseInt(br.readLine()); 
                  dll.delete(val); 
                  break; 
                case 5: 
                  dll.display(); 
                  break; 
                case 6: 
                  System.out.println("Exiting.....\n"); 
                  System.exit(0); 
                default : 
                  System.out.println("Invalid choice"); 
                } 
            } 
            while(ch!=6); 
      
        }
    }
