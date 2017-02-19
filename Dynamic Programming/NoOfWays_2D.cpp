#include<iostream>
#include<bits/stdc++.h>

using namespace std;

int main()
{
	long long int row,col,i,j;
	cin>>row>>col;
		
	long long int a[row][col];
	
	for(i = 0 ; i < row; i++)
	{
		for( j = 0; j < col; j++)
		{
			cin>>a[i][j];
		}
	}
	
	long long int b[row][col] = {0},sum;
	
	sum = 0;
	for( i = 0; i < row; i++)
	b[i][0] = 1;
	
	for( i = 0; i < col; i++)
	b[0][i] = 1;
		
	for ( i = 1; i < row ; i++)
	{
		for ( j =1 ; j < col; j++)
		{
			b[i][j] = b[i-1][j] + b[i][j-1];
		}
	}
	
	for ( i = 0; i < row ; i++)
	{
		for ( j =0 ; j < col; j++)
		{
			cout<<b[i][j]<<" ";
		}
		cout<<endl;
	}
	
	
	
	return 0;
}
