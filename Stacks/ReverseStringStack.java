package stacks;

import java.util.Scanner;

	class newstack {
		
		char[] a;
		int top;
		int size;
		
		newstack(int n){
			top = -1;
			size = n;
			a = new char[size];
		}
		
		void push(char item){
			if(top >= size){
				System.out.println("Stack full");
			}
			else {
				a[++top] = item;
			}
		}
		
		char pop(){
			if(top < 0){
				System.out.println("Underflow");
				return 0;
			}
			else {
				return a[top--];
			}		
		}
	}
	
public class ReverseStringStack {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
				
		int n = str.length();
		newstack ob1 = new newstack(n);
		
		for ( int i = 0; i < n; i++)
		{
			ob1.push(str.charAt(i));
		}
		
		for ( int i = 0; i < n; i++)
		{
			char ch = ob1.pop();
			System.out.println(ch);
		}
	}
}
