import java.io.*;
public class doublink {
      class Node
      {  
        int data;  
        Node previous;  
        Node next;  
        public Node(int data)
        {  
            this.data = data;  
        }  
      }  
      Node head, tail = null;  
      public void addNode(int data) {  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }  
   
    public void display() {   
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println("\n"); 
    }  
    public void delete(int data)
     {
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }
        while(current != null) 
        {
            if(current.data==data)
             break;
            current=current.next;
        }
        if(current==head)
        {
            head=current.next;
            current.next.previous=null;
        }
        else
        {   if(current.next==null)
            {
            tail=current.previous;
            current.previous.next=null;
            }
            else
            {
                current.next.previous=current.previous;
                current.previous.next=current.next;
            }
        }

     }
      public static void main(String[] args) throws NumberFormatException, IOException {
        int num,cho;
        doublink dList = new doublink();  
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        do {
            System.out.println(" OPTIONS:  1. insert\t2. Delete \t3.display\t4.exit\nenter the choice:  "); 
            cho=Integer.parseInt(br.readLine()) ;
            switch (cho) {
                case 1:
                    {
                        System.out.println("Enter the integerto be inserted: "); 
                        num=Integer.parseInt(br.readLine()) ;
                        dList.addNode(num); 
                        break;
                    } 
                    case 2:
                    {
                        System.out.println("Enter the integer to be deleted: "); 
                        num=Integer.parseInt(br.readLine()) ;
                        dList.delete(num); 
                        break;
                    }
                    case 3:
                    {
                        dList.display(); 
                        break;
                    } 
                    case 4:
                     {
                        System.out.println("exit..."); 
                        System.exit(0); 
                     }        
                default:
                    { System.out.println("wrong choice"); 
                      break;
                    }
            }
             
        } while (true);
        
    }  
}  
