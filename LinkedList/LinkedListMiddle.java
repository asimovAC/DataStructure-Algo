package trial;

public class LinkedListMiddle {

	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node ( int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public void printMiddle()
	{
		Node slow =  head;
		Node fast = head;
		
		while ( fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println(slow.data);
	}
	
	public static void main(String[] args) {
		
		LinkedListMiddle ob1 = new LinkedListMiddle();
		
		for ( int i = 1; i <= 10; i++)
		{
			ob1.push(i);
		}
		
		ob1.printMiddle();
		
	}

}
