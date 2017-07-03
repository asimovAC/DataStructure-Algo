package queue;

import java.util.NoSuchElementException;

public class Queue {
	
		int front,size,rear,len;
		int arr[];
		
		public Queue(int n)
		{
			this.size = n;
			this.front = -1;
			this.rear = -1;
			this.len = 0;
			this.arr = new int[size];
		}
	
		public boolean isEmpty()
		{
			if (front == -1)
				return true;
			return false;
		}
		
		public int getSize()
		{
			return len;
		}
		
		public boolean isFull()
		{
			if(rear == size - 1)
				return true;
			return false;
		}
		
		public void enqueue(int item)
		{
			if( rear == -1)
			{
				front = 0;
				rear = 0;
				arr[rear] = item;
			}
			else if ( rear + 1 >= size)
			{
				System.out.println("Overflow");
			}
			else if ( rear + 1 < size)
			{
				arr[++rear] = item;	
			}
			len++;
		}
		
		public int Dequeue()
		{
			
			if(isEmpty())
			{
				throw new NoSuchElementException("underflow");
			}
			else
			{
				len--;
				int ele = arr[front];
				
				if(front == rear)
				{
					front = -1;
					rear = -1;
				}
				else
				{
					front++;
				}
				return ele;
			}
			
		}

	public static void main(String[] args) {

		Queue ob1 = new Queue(10);
		
		
		ob1.enqueue(1);
		ob1.enqueue(2);
		ob1.enqueue(3);
		ob1.enqueue(4);
		
		System.out.println(ob1.Dequeue());

		System.out.println(ob1.len);
	}

}
