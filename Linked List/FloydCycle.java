//Cycle detection algo
// Java program to implement
// the above approach
import java.util.*;
class FloydCycle{
static class Node {
	int data;
	Node next;

	Node(int data)
	{
		this.data = data;
		next = null;
	}
};

// initialize a new head for the linked list
static Node head = null;
static class Linkedlist {
	// insert new value at the start
	void insert(int value)
	{
		Node newNode = new Node(value);
		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	// detect if there is a loop
	// in the linked list
	boolean detectLoop()
	{
		Node slow = head;
		Node fast= head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast= fast.next.next;
			if (slow == fast)
				return true;
		}
        return false;
	}
}

public static void main(String[] args)
{
	Linkedlist l1 = new Linkedlist();
	// inserting new values
	l1.insert(10);
	l1.insert(20);
	l1.insert(30);
	l1.insert(40);
	l1.insert(50);

	// adding a loop for the sake
	// of this example
	Node temp = head;
	while (temp.next != null)
		temp = temp.next;
	temp.next = head;
	// loop added;
    //System.out.println(l1);
	if (l1.detectLoop())
		System.out.print("Loop exists in the"
			+ " Linked List" +"\n");
	else
		System.out.print("Loop does not exists "
			+ "in the Linked List" +"\n");
}
}

Time complexity: O(n), as the loop is traversed once. 
Auxiliary Space: O(1), only two pointers are used therefore constant space complexity.

