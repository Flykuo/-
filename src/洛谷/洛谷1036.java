package Ве№И;

import java.util.Scanner;

public class Ве№И1036 {

	public static int a[]=new int[20];
	public static int n,k;
	public static boolean isprime(int n) {
		if(n<=3) {
			return n>1;
		}
		if(n%6!=1&&n%6!=5) {
			return false;
		}
		for(int i=5;i*i<n;i+=6) {
			if(n%i==0||n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
	public static int rule(int left,int sum,int start,int end) {
		if(left==0) {
			if(isprime(sum)) {
				return 1;
			}else {
				return 0;
			}
		}
		int sum1=0;
		for(int i=start;i<=end;i++) {
			sum1+=rule(left-1,sum+a[i],i+1,end);
		}
		return sum1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			n=sc.nextInt();
			k=sc.nextInt();
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println(rule(k,0,0,n-1));
		}
	}

}
