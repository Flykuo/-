package ���;

import java.util.Scanner;

public class ���1067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int arr[] = new int[n + 1];
			for (int i = n; i >= 0; i--) {
				arr[i] = sc.nextInt();
				if (arr[i] < 0 && i != 0 && i != n && i != 1) {// �������һ�к͵�һ�к͵����ڶ���
					if (arr[i] == -1) {
						System.out.print("-x^" + i);
					} else {
						System.out.print(arr[i] + "x^" + i);
					}
				} else if (arr[i] != 0 && arr[i] != 1 && i != 0 && i != n && i != 1) {// �������͵�һ�к͵����ڶ���
					System.out.print("+" + arr[i] + "x^" + i);
				} else if (arr[i] != 0 && arr[i] == 1 && i != 0 && i != n && i != 1) {// �������͵�һ�к͵����ڶ���
					System.out.print("+x^" + i);
				} else if (i == n) {// ��һ��
					if (arr[i] != 0) {
						if (arr[i] == 1) {
							System.out.print("x^" + i);
						} else if (arr[i] == -1) {
							System.out.print("-x^" + i);
						} else {
							System.out.print(arr[i] + "x^" + i);
						}
					}
				} else if (i == 0) {// ���һ��
					if (arr[i] > 0) {
						System.out.print("+" + arr[i]);
					} else if (arr[i] < 0) {
						System.out.print(arr[i]);
					}
				} else if (i == 1) {
					if (arr[i] > 0) {
						if(arr[i]==1) {
							System.out.print("+x");
						}else {	
							System.out.print("+" + arr[i]+"x");
						}
					} else if (arr[i] < 0) {
						if(arr[1]==-1) {
							System.out.print("-x");
						}else {		
							System.out.print(arr[i]+"x");
						}
					}
				}
			}
			System.out.println();
		}
	}

}
