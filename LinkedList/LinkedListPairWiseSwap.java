package trial;

public class LinkedListPairWiseSwap 
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
		
		public void pairSwap()
		{
			Node temp = head;
			
			while(temp!= null && temp.next!= null)
			{
				int k = temp.data;
				temp.data = temp.next.data;
				temp.next.data = k;
				
				temp = temp.next.next;
			}
		}
		

	public static void main(String[] args) {
		
		LinkedListPairWiseSwap llist = new LinkedListPairWiseSwap();
		 
        /* Created Linked List 1->2->3->4->5 */
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
         
        llist.print();
         
        llist.pairSwap();
         System.out.println();;
         
        llist.print();

	}

}
