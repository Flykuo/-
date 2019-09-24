package 洛谷;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 洛谷1478 {
    static Node node[]=new Node[5001];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),
        s=sc.nextInt(),
        height1=sc.nextInt(),
        height2=sc.nextInt(),
        cnt=0;
        height1+=height2;
        for(int i=0;i<num;i++){
            int h=sc.nextInt(),v=sc.nextInt();
            if(h<=height1){
                node[cnt]=new Node();
                node[cnt].h=h;
                node[cnt++].v=v;
            }
        }
        Arrays.sort(node, 0, cnt, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.v-o2.v;
            }
        });
        int ans=0;
        for(int i=0;i<cnt;i++){
            //System.out.println(node[i].h+" "+node[i].v);
            if(s-node[i].v>=0){
                ans++;
                s-=node[i].v;
            }
        }
        System.out.println(ans);
    }
    static class Node{
        int h,v;
    }
}
