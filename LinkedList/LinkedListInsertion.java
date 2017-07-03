package trial;


public class LinkedListInsertion {
	
	Node head;
	
	class Node{
	
		int info;
		Node next;
		
		Node(int info)
		{
			this.info = info;
			this.next = null;
			}
		}
	
		public void push( int data){
			
			Node new_node = new Node(data);
			new_node.next = head; 
			head = new_node;
			
		}
		
		public void insertAfter(Node prev,int data){
			Node new_node = new Node(data);
			new_node.next = prev.next;
			prev.next = new_node;
		}
		
		public void append(int data){
			Node new_node = new Node(data);
			
			if ( head == null)
			{
				head = new Node(data);
				return;
			}
			
			new_node.next = null;
			Node last = head;
			while (last.next!= null){
				last = last.next;
			}
			last.next = new_node;
			return;
		}
		
		public void print(){
			Node tnode = head;
			while(tnode!= null){
				System.out.println(tnode.info);
				tnode = tnode.next;
			}
		}
		
	public static void main(String[] args) {
		
		LinkedListInsertion new_list = new LinkedListInsertion();
		new_list.push(1);
		new_list.push(2);
		new_list.push(3);
		
		new_list.insertAfter(new_list.head, 7);
		new_list.append(6);
		new_list.print();
	}

}
