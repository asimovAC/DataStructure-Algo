package trial;

import trial.LinkedListMoveLastToHead.Node;

public class LinkedListSegregateOddEven 
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
		
		public void segregateOddAndEven()
		{
			Node prev = head;
			Node current;
			Node end = head;
			
			while(end.next != null )
			{
				end = end.next;
			}
			
			while(prev!=null )
			{
				int temp;
				current = prev.next;
				temp = current.data;
				
				if(temp%2 == 1)
				{
					end.next = current;
					prev.next = current.next;
					end = current;
				
				}
			}
		}

	public static void main(String[] args) {
		
		LinkedListSegregateOddEven llist = new LinkedListSegregateOddEven();
        
		llist.push(12);
		llist.push(1);
		llist.push(11);
        llist.push(10);
        llist.push(8);
        llist.push(6);
        llist.push(4);
        llist.push(2);
        llist.push(0);
        
      
        llist.segregateOddAndEven();
        llist.print();
		

	}

}
