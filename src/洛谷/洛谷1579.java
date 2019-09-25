package 洛谷;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 洛谷1579 {
    static int arr[]=new int[20001];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime();
        for(int i=0;3*list.get(i)<=n;i++){
            for(int j=i;2*list.get(j)<=n-list.get(i);j++){
                int a=n-list.get(i)-list.get(j);
                if(arr[a]!=1){
                    System.out.println(list.get(i)+" "+list.get(j)+" "+a);
                    return;
                }
            }
        }
    }
    static List<Integer> list=new LinkedList<>();
    static void prime(){
        for(int i=2;i<20000;i++){
            if(arr[i]==0){
                arr[i]=i;
                list.add(i);
                for(int j=2*i;j<20000;j+=i){
                    arr[j]=1;
                }
            }
        }
    }
}
