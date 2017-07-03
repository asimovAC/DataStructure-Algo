package trial;

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
	
	public class LinkedListMergeTwoSortedLists
	{
		static Node head;
		public void push(int item)
		{
			Node new_node = new Node(item);
			new_node.data = item;
			new_node.next = head;
			head = new_node;
		}
		
		public static void print(Node tnode)
		{
			tnode = head;
			while(tnode!=null)
			{
				System.out.println(tnode.data);
				tnode = tnode.next;
			}
		}
		
		public static Node merge(Node l1,Node l2)
		{
			Node p = head;
			
			Node p1 = l1;
			Node p2 = l2;
			
			while(p1 != null && p2 != null)
			{
				if (p1.data < p2.data )
				{
					p.next = p1;
					p1 = p1.next;
				}
				else
				{
					p.next = p2;
					p2 = p2.next;
				}
				p = p.next;
			}
			
			if( p1 != null)
			{
				p.next = p1;
			}
			
			if( p2 != null)
			{
				p.next = p2;
			}
			
			return head.next;
		}
				
	public static void main(String[] args) {
		
		Node n1=new Node(4);
        Node n2=new Node(5);
        Node n3=new Node(7);
        Node n4=new Node(10);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;

        Node n5=new Node(3);
        Node n6=new Node(6);
        Node n7=new Node(9);
        Node n8=new Node(15);
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        n8.next=null;

        Node f = merge(n1,n5);
		print(f);
		
	}

}
