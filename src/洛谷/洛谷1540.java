package Ве№И;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ве№И1540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			Queue<Integer> s=new LinkedList<>();
			int sum=0;
			int index=-1;
			for(int i=0;i<m;i++) {
				int a=sc.nextInt();
				for(Integer b:s) {
					if(b==a) {
						index=1;
						break;
					}
				}
				if(index==1) {
					index=-1;
					continue;
				}
				if(s.size()==n) {
					s.poll();
				}
				sum++;
				s.add(a);
			}
			System.out.println(sum);
		}
	}

}
