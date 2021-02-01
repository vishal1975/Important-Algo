package Subsequence_and_substring;

import java.util.Scanner;

public class Largest_increasing_subsequence_Optimised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
		}
		
       new Solver().solve(a, n);
	}



static class Solver{
	public void solve(int a[],int n) {
		
		int b[]=new int[n];
		int count=0;
		b[0]=a[0];
		
		for(int i=1;i<n;i++) {
			
			if(a[i]>b[count]) {
				b[++count]=a[i];
			}
			else {
				int index=binary_search(0,count,a[i],b);
				b[index]=a[i];
				
			}
		}
	//	16
		//0 8 4 12 2 10 6 14 1 9 5 13 3 11 7 15
		
		System.out.println(count+1);
		
	}
	
	int binary_search(int i,int j,int k,int a[]) {
		while(i<=j) {
			int mid=(i+j)/2;
			if(i==j) {
				return i;
			}
			if(a[mid]<k) {
				i=mid+1;
			}
			else {
				j=mid;
			}
		}
		
		return i;
			
	}
	
}
	
}
