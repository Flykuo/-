package 洛谷;

import java.util.Scanner;

public class 洛谷1028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int arr[]=new int[1001];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<1001;i++) {
			if(i%2==0) {
				arr[i]=arr[i-1]+arr[i/2];
			}else {
				arr[i]=arr[i-1];
			}
		}
		while(sc.hasNext()) {
			int n=sc.nextInt();
			System.out.println(arr[n]);
		}
		//hhh
	}
}
