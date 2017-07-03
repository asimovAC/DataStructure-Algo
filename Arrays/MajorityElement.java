package Arrays;

public class MajorityElement {

	int find(int arr[],int n)
	{
		int maj_index = 1;
		int count = 1;
		
		for (int i = 1; i < n ; i++)
		{
			if(arr[maj_index] == arr[i])
				count++;
			else 
				count--;
			
			if(count == 0)
				{	maj_index = i;
					count = 1;
				}
		}
		return arr[maj_index];
	}
	
	int element(int arr[],int n)
	{
		int ans = find(arr,n);
		int num = 0;
		for( int i = 0; i < n; i++)
		{
			if(ans == arr[i])
				num++;
		}
		
		if(num > (n/2))
			return ans;
		else
			return -1;
	}
	public static void main(String[] args) {
		
		MajorityElement majorelement = new MajorityElement();
        int a[] = new int[]{1, 3, 3, 1, 2,3,3};
        int size = a.length;
        System.out.println(majorelement.element(a, size));
			
	}

}
