package trial;

import trial.LinkedListPointerToNode.Node;

 public class LinkedListIntersection 
{
	 static Node n1,n2;
	static class Node
	{
		int data;
		Node next;
		
		public Node(int item)
		{
			this.data = item;
			this.next = null;
		}
	}
		public int getCount(Node head)
		{
			int count = 0;
			Node count_node = head;
			
			while(count_node != null)
			{
				count = count + 1;
				count_node = count_node.next;
			}
			return count;
		}
		
		public int getNode()
		{
			int c1 = getCount(n1);
			int c2 = getCount(n2);
			
			int d;
			
			if( c1 > c2)
			{
				d = c1 - c2;
				return getIntersection(d,n1,n2);
			}
			else
			{
				d = c2 - c1;
				return getIntersection(d,n2,n1);
			}
		}
		
		public int getIntersection(int d,Node n1,Node n2)
		{
			Node current1 = n1;
			Node current2 = n2;
			
			for ( int i = 0; i < d; i++)
			{
				if(current1 == null)
				{
					return -1;
				}
				current1 = current1.next;
			}
			while(current1 != null && current2 != null)
			{
				if(current1.data == current2.data)
				{
					return current1.data;
				}
				current1 = current1.next;
				current2 = current2.next;
			}
			return -1;
		}
		
	
	public static void main(String[] args) {
		
		LinkedListIntersection list = new LinkedListIntersection();
		 
        // creating first linked list
        list.n1 = new Node(3);
        list.n1.next = new Node(6);
        list.n1.next.next = new Node(15);
        list.n1.next.next.next = new Node(15);
        list.n1.next.next.next.next = new Node(30);
 
        // creating second linked list
        list.n2 = new Node(10);
        list.n2.next = new Node(15);
        list.n2.next.next = new Node(30);
        
        System.out.println(list.getNode());

	}

}
