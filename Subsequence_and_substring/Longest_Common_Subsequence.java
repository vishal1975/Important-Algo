package Subsequence_and_substring;

import java.util.Scanner;



public class Longest_Common_Subsequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		String p=sc.next();
		String q=sc.next();
		
		new Solver().solve(p, q, n1, n2);
      
	}



static class Solver{
//	11
//	10
//	Hackerhappy
//	Hackerrank
	
	int longest_common_substring(String p,String q,int i,int j,int n1,int n2) {
		if(i>=n1) {
			return 0;
		}
		if(j>=n2) {
			return 0;
		}
		int a=0,b=0,c=0;
		
		if(p.charAt(i)==q.charAt(j)) {
			a=1+longest_common_substring(p,q,i+1,j+1,n1,n2);
		
		b=longest_common_substring(p,q,i+1,j,n1,n2);
		c=longest_common_substring(p,q,i,j+1,n1,n2);
		}
		return Math.max(a,Math.max(b, c));
	}
	
	
	
	
	public void solve(String p,String q,int n1,int n2) {
	
		int max=longest_common_substring(p,q,0,0,n1,n2);
		System.out.println(max);
	}
	
	
	
}
}
