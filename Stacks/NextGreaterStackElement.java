package stacks;

public class NextGreaterStackElement {

	class Stack
	{
	
		int top;
		int arr[],size,len;
		
		public Stack(int n)
		{
			top = -1;
			size = n;
			arr = new int[size];
		}
	
		public int top(Stack s)
		{
			return arr[top];
		}
		
		boolean isEmpty(Stack s)
		{
			if(s.top(s) == -1)
				return true;
			return false;
		}
		public void push(int data)
		{
			if(top + 1 >= size)
			{
				System.out.println("StackOverflow");
			}
			else
			{
				top++;
				arr[top] = data;
			}
		}
		
		public int pop()
		{
			if(top > 0)
			{
				int x = arr[top];
				top--;
				return x;
			}
			else
			{
				System.out.println("Underflow");
				return -1;
			}		
		}
	}
	
	void NGE(int arr[],int n)
	{
		Stack newstack = new Stack(n);
		newstack.push(arr[0]);
		
		int element,next;
		
		for(int i = 1; i < n; i++)
		{
			next = arr[i];
			
			if(newstack.isEmpty(newstack) == false)
			{
				element = newstack.pop();
				
				while(element < next)
				{
					System.out.println(element + "--" + next);
					if(newstack.isEmpty(newstack) == true)
					{
						break;
					}
					element = newstack.pop();
				}
				
				if ( element > next )
				{
					newstack.push(element);
				}
			}
			newstack.push(next);
		}
	}
	
	public static void main(String[] args) {
		
		NextGreaterStackElement ob1 = new NextGreaterStackElement();
		int arr[]= {11, 13, 21, 3};
	    int n = arr.length;
	    
	   ob1.NGE(arr, n);
	    

	}

}
