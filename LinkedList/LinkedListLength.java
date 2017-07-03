package trial;

public class LinkedListLength {

	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	void push(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
		
		int countNodes()
		{
			int count = 0;
			Node tnode = head;
			if(tnode == null)
				return 0;
			
			while(tnode!=null)
			{
				count++;
				tnode = tnode.next;
			}
			
			return count;
		}
	
	public static void main(String[] args) {
		
		LinkedListLength llist = new LinkedListLength();
		
		llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        
        System.out.println(llist.countNodes());
		
	}

}
