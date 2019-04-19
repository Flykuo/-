package Ве№И;

import java.util.Scanner;

public class Ве№И1055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str=sc.next();
			String str1=str;
			str=str.replace("-", "");
			int sum=0;
			for(int i=0;i<str.length()-1;i++) {
				sum+=Integer.parseInt(String.valueOf(str.charAt(i)))*(i+1);
			}
			if(sum%11==10) {
				if(str1.charAt(str1.length()-1)=='X') {
					System.out.println("Right");
				}else {
					System.out.println(str1.substring(0, str1.length()-1)+"X");
				}
			}else {
				if(str1.charAt(str1.length()-1)=='X'||sum%11!=Integer.parseInt(String.valueOf(str.charAt(str.length()-1)))) {
					System.out.println(str1.substring(0, str1.length()-1)+sum%11);
				}else {
					System.out.println("Right");
				}
			}
		}
	}
}
