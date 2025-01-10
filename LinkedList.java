import java.util.Scanner;
public class LinkedList {
    class Node {
        int data;
        Node next;

public Node(int data) {
this.data = data;
this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } 
else 
{
tail.next = newNode;
tail = newNode;
        }
    }

public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int pos=0;
        int data,data1;
        System.out.println("ENTER INTEGERS TO CREATE NODES (ENTER A NON-INTEGER TO EXIT):");
        while (sc.hasNext())
        {
         
            if(sc.hasNextInt())
            {
            data = sc.nextInt();
            list.addNode(data);
            }
          else
          {
            String temp=sc.next();
            System.out.println("LINKED LIST CREATED");
            System.out.println("LINKED LIST BEFORE INSERTING");
            list.displayList();
            System.out.println("ENTER THE POSITON WHERE YOU WANT TO INSERT");
            if(sc.hasNextInt())
            {
            pos=sc.nextInt();
            System.out.println("ENTER THE ELEMENT TO BE INSERTED:");
            if(sc.hasNextInt())
            {
            data1=sc.nextInt();
            list.insertMiddle(data1,pos);
            System.out.println("LINKED LIST AFTER INSERTING");
            list.displayList();
            }
            else
            {
              System.out.println("Enter integers only");
              System.exit(0);
            }
            }
            else
            {
              System.out.println("Enter integers only");
              System.exit(0);
            }
           }
        }
    }
public void insertMiddle() 
    {    
//TYPE YOUR CODE HERE
    }

public void displayList() {
        Node current = head;
        while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
        }
System.out.println("null");
    }
}