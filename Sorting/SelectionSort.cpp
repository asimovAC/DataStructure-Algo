#include<bits/stdc++.h>

using namespace std;

void swap ( int *a, int *b)
{
	int temp = *a;
	*a = *b ;
	*b = temp;
}

int main()
{
	int n;
	cin>>n;
	
	int arr[n],i,min,j;
	
	for ( i = 0; i < n; i++)
	cin>>arr[i];
	
	for (i = 0; i < n-1	; i++)
	{
		min = i;
		for ( j = i+1; j < n; j++ )
		{
			if(arr[j]< arr[min])
			min = j;
			
			swap(&arr[min],&arr[i]);
		}
	}
	
	for ( i = 0; i < n; i++)
	cout<<arr[i]<<" ";
	
	return 0;
	
}
