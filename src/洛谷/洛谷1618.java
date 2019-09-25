package 洛谷;

import java.util.Scanner;

public class 洛谷1618 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int arr[],source=-1;
        for(int temp=123;temp<=333;temp++){
            int i=temp;
            if(i%10==0){
                continue;
            }
            arr=new int[10];
            arr[i/100]=1;
            arr[i/10%10]=1;
            arr[i%10]=1;
            i=i*b/a;
            if(i>=987){
                continue;
            }
            arr[i/100]=1;
            arr[i/10%10]=1;
            arr[i%10]=1;
            i=i*c/b;
            if(i>=987){
                continue;
            }
            arr[i/100]=1;
            arr[i/10%10]=1;
            arr[i%10]=1;
            boolean flag=true;
            for(int j=1;j<=9;j++){
                if(arr[j]==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(i/c*a+" "+i/c*b+" "+i);
                source=1;
            }
        }
        if(source==-1){
            System.out.println("No!!!");
        }
    }
}
