package trial;

public class LongValidSubStringStack {

	class Stack
	{
		int top,size,len;
		int arr[];
		
		Stack(int n)
		{
			this.top = -1;
			this.size = n;
			this.len = 0;
			arr = new int[size];
		}
		
		boolean isEmpty()
		{
			if(top == -1)
				return true;
			return false;
		}
		
		boolean isFull()
		{
			if(top == size -1)
				return true;
			return false;
		}
		
		int getSize()
		{
			return len;
		}
		
		void push(int item)
		{
			if (isFull())
				System.out.println("Overflow");
			else
			{
				arr[++top] = item;
				len++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
