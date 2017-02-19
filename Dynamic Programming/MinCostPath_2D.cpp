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
	
	long long int b[row+1][col+1] = {0},sum;
	
	sum = 0;
	for( i = 0; i <= row; i++)
	{
		b[i][0] = sum + a[i][0];
		sum = b[i][0];
		//cout<<sum;
	}
	
	sum = 0;
	for( i = 0; i <= col; i++)
	{
		b[0][i] = sum + a[0][i];
		sum = b[0][i];
	}
	
	for ( i = 1; i < row ; i++)
	{
		for ( j =1 ; j < col; j++)
		{
			b[i][j] = a[i][j] + std::min(b[i-1][j],b[i][j-1]);
		}
	}
	
	cout<<b[row -1][col -1]<<endl;
	
	
	return 0;
}
