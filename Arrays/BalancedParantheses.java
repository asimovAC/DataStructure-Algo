package Arrays;

public class BalancedParantheses {

	class Stack
	{
		int top;
		int size;
		char arr[];
		
		Stack(int n)
		{
			top = -1;
			arr = new char[n];
		}
	
		public void push(char a)
		{
			top = top + 1;
			arr[top] = a;
		}
		
		 public char pop()
		{
			char x = arr[top];
			top = top - 1;
			return x;
		}
		 
		boolean isEmpty()
		{
			if( top == -1)
				return true;
			return false;
		}
	}	
		public boolean CheckBalanced(String str,int n)
		{
			Stack stack = new Stack(n);
			
			for( int i = 0; i < n; i++)
			{
				char c = str.charAt(i);
				if( c == '{' || c == '(' || c == '[')
				{
					stack.push(c);
				}
				else if(c == ']') {
	                if(stack.isEmpty()) return false;
	                if(stack.pop() != '[') return false;

	            }else if(c == ')') {
	                if(stack.isEmpty()) return false;
	                if(stack.pop() != '(') return false;

	            }else if(c == '}') {
	                if(stack.isEmpty()) return false;
	                if(stack.pop() != '{') return false;
	            }
			}
			if (stack.isEmpty())
				return true;
			else
				return false;
		}
	
	public static void main(String[] args) {
		
		BalancedParantheses ob1 = new BalancedParantheses();
		String s ="{({}()()()()[][][][])}";
		int n = s.length();
		
		System.out.println(ob1.CheckBalanced(s, n));
		
	}

}
