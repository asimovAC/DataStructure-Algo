package trial;

public class LinkedListSwapNode {

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
	
	public void swapNode (int x,int y)
	{
		if( x == y) return;
		
		Node prevX = null;
		Node currX = head;
		
		while(currX != null && currX.data != x)
		{
			prevX = currX;
			currX = currX.next;
		}
		
		Node prevY = null;
		Node currY = head;
		
		while(currY != null && currY.data != y)
		{
			prevY = currY;
			currY = currY.next;
		}
		
		if(currX == null && currY == null)
			return;
		
		if(prevX != null)
		{
			prevX.next = currY;
		}
		else
		{
			head = currY;
		}
		
		if(prevY != null)
		{
			prevY.next = currX;
		}
		else
		{
			head = currX;
		}
		
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}
	
	public void push(int item)
	{
		Node new_node = new Node(item);
		new_node.next = head;
		head = new_node;
	}
	
	public void print()
	{
		Node tnode = head;
		while(tnode!=null)
		{
			System.out.print(tnode.data + "-");
			tnode = tnode.next;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedListSwapNode llist = new LinkedListSwapNode();
		
		llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        
        System.out.println(" before calling swapNodes() ");
        llist.print();
        
        llist.swapNode(6, 1);
		
        System.out.println();
        
        System.out.println("swapNodes() ");
        llist.print();

	}

}
