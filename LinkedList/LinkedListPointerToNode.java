package trial;

public class LinkedListPointerToNode 
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
		public void removePointerNode( Node node)
		{
			Node temp = node.next;
			node.data = temp.data;
			node.next = temp.next;
			temp = null;
		}
	
	
	public static void main(String[] args) 
	{
		LinkedListPointerToNode list1 = new LinkedListPointerToNode();
		
		list1.push(1);
		list1.push(2);
		list1.push(3);
		list1.push(4);
		list1.push(5);
		
		list1.removePointerNode(head);
		
		
        list1.print();
		
	}

}
