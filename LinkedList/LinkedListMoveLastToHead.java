package trial;

import trial.LinkedListPairWiseSwap.Node;

public class LinkedListMoveLastToHead {

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
			
			public void swapLastToFront()
			{
				Node sec_last = null;
				Node last = head;
				
				while(last.next != null)
				{
					sec_last = last;
					last = last.next;
				}
				
				sec_last.next = null;
				last.next = head;
				
				head = last;
			}
			
			
	public static void main(String[] args) {
		
		LinkedListMoveLastToHead llist = new LinkedListMoveLastToHead();
        /* Constructed Linked List is 1->2->3->4->5->null */
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
       
       // llist.print();
        System.out.println();
        
        llist.swapLastToFront();
        System.out.println();
        
        llist.print();

	}

}
