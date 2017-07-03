package trial;

public class LinkedListRemoveDuplicates 
{
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
				System.out.println(tnode.data);
				tnode = tnode.next;
			}
		}
		
		public void removeDuplicate(Node head)
		{
			Node current = head;
			Node next_current ;
			
			while(current.next != null)
			{
				if (current.data == current.next.data)
				{
					next_current = current.next.next;
					current.next = null;
					current.next = next_current;
				}
				else
				{
					current = current.next;
				}
			}
			
		}
	public static void main(String[] args) {
		
		LinkedListRemoveDuplicates ob1 = new LinkedListRemoveDuplicates();
		
		ob1.push(20);
		ob1.push(13);
		ob1.push(13);
		ob1.push(11);
		ob1.push(11);
		ob1.push(11);
		ob1.push(11);
		
		ob1.removeDuplicate(head);
		ob1.print();

	}

}
