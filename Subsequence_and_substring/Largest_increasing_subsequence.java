package Subsequence_and_substring;
import java.util.*;
public class Largest_increasing_subsequence {

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

}

class Solver{
	public void solve(int a[],int n) {
		
		
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			b[i]=1;
		}
		for(int i=1;i<n;i++) {
			
			for(int j=0;j<=i-1;j++) {
				if(a[j]<a[i]) {
					b[i]=Math.max(b[j]+1, b[i]);
				}
			}
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(b[i]+" ");
		}
		
	}
}
