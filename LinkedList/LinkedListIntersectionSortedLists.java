package trial;

public class LinkedListIntersectionSortedLists {
	
	static Node head;
	
	class Node
	{
		int data;
		Node next;
	
	
		public Node(int item)
		{
			this.data = item;
			this.next = null;
		}
	}
	public void push(int item)
	{
		Node new_node = new Node(item);
		new_node.data = item;
		new_node.next = head;
		head = new_node;
	}

	public void print()
	{
		Node tnode = head;
		
		while(tnode!=null)
		{
			System.out.print(tnode.data + " ");
			
			tnode = tnode.next;
		}
	}
	
	public void intersection(Node head1,Node head2)
	{
		Node a = head1;
		Node b = head2;
		
		Node temp = head;
		
		while( a != null && b != null)
		{
			
			if (a.data == b.data)
			{	
				temp.data = a.data;
				temp = temp.next;
				a = a.next;
				b = b.next;
				
			}
			else if( a.data < b.data)
			{
				a = a.next;
			}
			else
			{
				b = b.next;
			}
		
		}
	}

	public static void main(String[] args) {
		 
		LinkedListIntersectionSortedLists ob1 = new LinkedListIntersectionSortedLists();
		LinkedListIntersectionSortedLists ob2 = new LinkedListIntersectionSortedLists();  
		LinkedListIntersectionSortedLists ob3 = new LinkedListIntersectionSortedLists();
		
		ob1.push(6);
		ob1.push(5);
		ob1.push(4);
		ob1.push(3);
		ob1.push(2);
		ob1.push(1);
		
		ob2.push(8);
		ob2.push(6);
		ob2.push(4);
		ob2.push(2);
		
		ob3.intersection(ob1.head, ob2.head);
		ob2.print();
		
		 
	}

}
