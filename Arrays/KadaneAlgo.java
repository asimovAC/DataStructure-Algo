package Arrays;

public class KadaneAlgo {

	int max(int a,int b)
	{
		if ( a > b)
			return a;
		else
			return b;
	}
	
	int findSum(int arr[],int n)
	{
		int max_current = arr[0];
		int max_global = arr[0];
		
		for ( int i = 1; i < n - 1; i++)
		{
			max_current = max (arr[i],max_current + arr[i]);
			if( max_current > max_global)
				max_global = max_current;
		}
		
		return max_global;
	}
	
	public static void main(String[] args) {
		
		KadaneAlgo ob1 = new KadaneAlgo();
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		int size = a.length;
		
		System.out.println(ob1.findSum(a, size));
	}

}
