package Ве№И;

import java.util.Scanner;

public class Ве№И1200 {

	public static int mod=47;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		while(sc.hasNext()) {
			String str1=sc.next();
			String str2=sc.next();
			int sum1=1;
			int sum2=1;
			for(int i=0;i<str1.length();i++) {
				sum1=(sum1*(int)(str1.charAt(i)-64))%mod;
			}
			for(int i=0;i<str2.length();i++) {
				sum2=(sum2*(int)(str2.charAt(i)-64))%mod;
			}
			if(sum1==sum2) {
				System.out.println("GO");
			}else {
				System.out.println("STAY");
			}
		}
	}

}
