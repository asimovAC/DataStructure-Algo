package queue;

import java.util.Stack;

class ImplementingQueueUsingStack {

	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
		
	public void enqueue(int item)
	{
		s1.push(item);
	}
	
	public boolean emptyQ()
	{
		return s1.isEmpty() && s2.isEmpty();
	}
	
	public void front()
	{
		while(!s1.isEmpty())
		{
			int temp = s1.pop();
			s2.push(temp);
		}
		System.out.print(s2.peek());
	}
	
	public int dequeue()
	{
		while(!s1.isEmpty())
		{
			int temp = s1.pop();
			s2.push(temp);
		}
		return s2.pop();
	}
	
	public static void main(String[] args) {
		
	}

}
