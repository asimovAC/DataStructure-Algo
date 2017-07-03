package trial;

import trial.LinkedListPointerToNode.Node;

public class LinkedListReverse 
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
		
		public void print(Node tnode)
		{
			
			while(tnode!=null)
			{
				System.out.print(tnode.data + " ");
				tnode = tnode.next;
			}
			System.out.println();
		}

		public Node reverse(Node node_rev)
		{
			Node prev = null;
			Node current = node_rev;
			Node next_node = null;
			
			while(current != null)
			{
				next_node = current.next;
				current.next = prev;
				prev = current;
				current = next_node;
			}
			node_rev = prev;
			return node_rev;
		}
	
	public static void main(String[] args) {
		
		LinkedListReverse list1 = new LinkedListReverse();
		
		list1.push(1);
		list1.push(2);
		list1.push(3);
		list1.push(4);
		list1.push(5);
		
		list1.print(head);
		Node n1 = list1.reverse(head);
		
        list1.print(n1);
	}

}
