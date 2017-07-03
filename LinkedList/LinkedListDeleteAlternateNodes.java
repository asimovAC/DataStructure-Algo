package trial;

import trial.LinkedListMoveLastToHead.Node;

public class LinkedListDeleteAlternateNodes 
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
				System.out.print(tnode.data + " ");
				
				tnode = tnode.next;
			}
		}
		
		public void deleteAlternate()
		{
			Node prev = head;
			Node node = prev.next;
			
			while(prev !=null && node != null )
			{
				prev.next = node.next;
				prev = prev.next;
				
				if(prev != null)
				{
					node = prev.next;
				}
				
			}
		}
	public static void main(String[] args) {
		
		LinkedListDeleteAlternateNodes llist = new LinkedListDeleteAlternateNodes();
        
        /* Constructed Linked List is 1->2->3->4->5->null */
		llist.push(7);
		llist.push(6);
		llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
         
        System.out.println("Linked List before calling deleteAlt() ");
         
        llist.deleteAlternate();
        
        llist.print();

	}

}
