package Arrays;

import java.util.Stack;

class NextGreaterElement 
{
	public static void nge(int arr[])
	{
		Stack<Integer>s1 = new Stack<Integer>();
		
		s1.push(arr[0]);
		
		int i,element,next;
		
		for( i = 1; i < arr.length; i++)
		{
			next = arr[i];
			if( s1.isEmpty() == false)
			{
				element = s1.pop();
				
				while( element < next)
				{
					System.out.println("NGE for " + element + " is " + next);
					if(s1.isEmpty())
						break;
					element = s1.pop();
				}
				
				if( element > next)
					s1.push(element);
			}
			s1.push(next);
		}
		
		while(!s1.isEmpty())
		{
			element = s1.pop();
			next = -1 ;
			System.out.println("NGE for " + element + " is " + next);
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 4,3,5,2,25 };
        int n = arr.length;
        
        nge(arr);

	}

}
