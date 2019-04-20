package Ве№И;

import java.util.Scanner;

public class Ве№И1914 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String str = sc.next();
			for (int i = 0; i < str.length(); i++) {
				if ((int) str.charAt(i) + n <= 122 && (int) str.charAt(i) + n >= 97) {
					System.out.print((char) ((int) str.charAt(i) + n));
				} else {
					System.out.print((char) ((int) str.charAt(i) - 26 + n));
				}
			}
			System.out.println();
		}
	}

}