package 洛谷;

import java.util.Scanner;

public class 洛谷2089 {
    static int arr[][]=new int[10001][11],a[]=new int[11],ans=0,n;

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        dfs(1,0);
        System.out.println(ans);
        for(int i=1;i<=ans;i++){
            for(int j=1;j<11;j++){
                if(j!=1){
                    System.out.print(" ");
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static void dfs(int num,int value){
        if(num==11){
            if(value==n){
                ans++;
                for(int i=1;i<11;i++){
                    arr[ans][i]=a[i];
                }
            }
            return;
        }
        for(int i=1;i<=3;i++){
            if(value+i>n){break;}
            a[num]=i;
            dfs(num+1,value+i);
            a[num]=0;
        }
    }
}
