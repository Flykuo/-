package 洛谷;

import java.util.Arrays;
import java.util.Scanner;

public class 洛谷3370 {

	static int base = 23, mod = (int) (1e9 + 7), prime = 233;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String str = "";
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				str = sc.next();
				arr[i] = strvalue(str);
			}
			Arrays.sort(arr);
			int ans = 1;
			for (int i = 0; i < n - 1; i++) {
				if (arr[i] != arr[i + 1]) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}

	static int strvalue(String str) {
		// TODO Auto-generated method stub
		int value = 0, length = str.length(), flag = -1;
		char[] ch = str.toCharArray();
		for (int i = 0; i < length; i++) {
			value = (value * base + (int) ch[i]) % mod + prime;
		}
		return value;
	}
}
