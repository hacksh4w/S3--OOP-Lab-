import java.util.Scanner;
public class Double {
    class Node {
        int data;
        Node next;
        Node prev = null;

        Node(int data){
            this.data = data;
        }
    }

    Node head = null, tail = null;

    public void insert (int data){
        Node n = new Node(data);
        if (head == null){
                head = n;
             
        }
        else{
            tail.next = n;
            n.prev = tail;
        }
            
        tail= n;    
    }

    public void insertAtHead(int data){
        Node n = new Node(data);
        n.next = head;
        head.prev = n;
        head = n;
    }

    public void insertInb(int data, int ele){
        Node n = new Node(data);
        Node temp = head;
        while(temp.next!=null){
            if (temp.data == ele){
                n.prev = temp;
                n.next = temp.next;
                temp.next.prev = n;
                temp.next = n;
                return;
            }

            temp = temp.next;
        }
    }
    public void printNodes() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            System.out.println(current.data + " ");  
            current = current.next;  
        }  
    }  


    public void removeVal(int data){
        Node temp = head;

        while(temp.next !=null){
            if(temp.data == data){
                temp.next.prev = temp.prev;
                temp.prev.next = temp.next;
            }
            temp = temp.next;
        }
        printNodes();
    }


    public static void main(String[] args) {
        Double dl = new Double();

        dl.insert(1);
        dl.insert(2);
        dl.insert(3);
        dl.insert(4);
        dl.insert(5);
        dl.printNodes();
         System.out.print("Enter ");
         char ch;
        switch(ch) {
                case '1':
                    System.out.print("Insert: ");
                     d=br.readInt();
                     dl.insert(a);
                    break;
                case '2':
                     System.out.print("Delete : ");
                     v=br.readInt();
                     dl.removeVal(v);
                     printNodes(); 
                     break;
                case '3':
                    System.out.print("Print ");
                    printNodes(); 
                    break;}
        dl.insertAtHead(-1);
        dl.printNodes();
        dl.removeVal(3);
    }

}
