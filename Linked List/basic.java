import java.util.*;
public class LinkedList{
    public static Node head;
    public static Node tail;
    public static int size;

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public void addFirst(int data){
        //step1 Create new node
        Node newnode = new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        //step2 new node next = head
        newnode.next=head;
        //step3 head = newnode
        head= newnode;
    }

    public void addLast(int data){
        //step1 Create a new node
        Node newnode = new Node(data);
        size++;
        tail.next=newnode;
        tail= newnode;
    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        
        Node newnode = new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
        }
        else if(size==1){
            int val= head.data;
            head=tail=null;
            size=0;
            //return val;
        }
        //value to be deleted
        //int val= head.data;
        head=head.next;
        size--;
        //return val;
    }

    public void print(){  //O(n)
        if (head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp;
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(5);
        ll.print();
        System.out.println(ll.size);
        
    }
}
