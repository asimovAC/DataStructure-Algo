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
	
	for( i = 2;i < n; i++)
	{
		for ( j = 0; j < i; j++)
		{
			if(arr[i] < arr[j])
			swap(&arr[i],&arr[j]);
		}
	}
	
	for ( i = 0; i < n; i++)
	cout<<arr[i]<<" ";
	
	return 0;
	
}
