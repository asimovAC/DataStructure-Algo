package trial;

public class LinkedListPalindrome 
{
	Node head;
	Node slow_ptr;
	Node fast_ptr;
	
	class Node
	{
		int data;
		Node next;
		
		public Node(int item)
		{
			this.data = item;
			this.next = null;
		}
		
		public void reverse(Node rev_node)
		{

			Node prev = null;
			Node current = rev_node;
			Node next_node = null;
			
			while(current != null)
			{
				
			}
		}
		
		public boolean checkPalindrome(Node head)
		{
			slow_ptr = head;
			fast_ptr = head;
			
			Node prev_of_slow_ptr = head;
			Node midnode = null;
			
			while(fast_ptr != null && fast_ptr.next != null)
			{
				fast_ptr = fast_ptr.next.next;
				
				slow_ptr = slow_ptr.next;
			}
			
		}
	}
	
	public static void main(String[] args) {
		

	}

}
