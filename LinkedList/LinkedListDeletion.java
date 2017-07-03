package trial;

public class LinkedListDeletion {

	Node head;
	
	class Node 
	{
		int data;
		Node next;
		
		Node ( int data)
		{
			this.data= data;
			this.next = null;
		}
	}
		void push(int data)
		{
			Node new_node = new Node(data);
			new_node.next = head;
			head = new_node;
			
		}
		
		void deleteNode(int key)
		{
			Node temp = head;
			Node prev = null;
			
			if(temp!= null && head.data == key)
			{
				head = temp.next;
				return;
			}
			
			while(temp!=null && temp.data!=key)
			{
				prev = temp;
				temp = temp.next;
			}
			
			if(temp == null)
			{
				return;
			}
			
			prev.next = temp.next;
		}
		
		void deleteNodeAtPosition(int position)
		{
			Node temp = head;
			
			if(position == 0)
			{
				head = temp.next;
				return;
			}
			
			for ( int i = 0; temp!= null && i < position -1 ; i++)
			{
				temp = temp.next;
			}
			
			if(temp == null && temp.next == null)
			{
				return;
			}
			
			Node next = temp.next.next;
			temp.next = next;
		}
		
		void print()
		{
			Node tnode = head;
			while(tnode!=null)
			{
				System.out.print(tnode.data + "->");
				tnode = tnode.next;
			}
		}
	
	
	public static void main(String[] args) {
		
		LinkedListDeletion myList = new LinkedListDeletion();
		myList.push(1);
		myList.push(2);
		myList.push(3);
		myList.push(4);
		
		myList.deleteNode(3);
		
		myList.print();
	}

}
	