package Arrays;

class MinUnsortedArray {

	public static void calculate(int arr[])
	{
		int i,j,start,end,min,max,n;
		start = 0;
		end = 0;
		n = arr.length;
		for( i = 0; i < n; i++)
		{
			j = i + 1;
			if(arr[j] < arr [i])
				{
					start = i;
					break;
				}
		}
		for( i = n -1; i >= 0; i--)
		{
			j = i - 1;
			if(arr[j] > arr [i])
				{
					end = i;
					break;
				}
		}
	
		
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		
		for(i = start; i <= end; i++)
		{
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		
		for ( i = 0; i < start; i++)
		{
			if(arr[i] > min)
			{
				start = i;
				break;
			}
		}
		
		for ( i = n-1; i >= end+1; i--)
		{
			if(arr[i] < max)
			{
				end = i;
				break;
			}
		}
		
		System.out.println(start + "-" + end);
	}
	public static void main(String[] args) {
		
		int arr[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		
		calculate(arr);
	}

}
