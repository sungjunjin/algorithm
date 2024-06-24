package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 조합의 경우수 (메모이제이션)
 */
public class P0808 {
    static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        f=kb.nextInt();
        b=new int[n];
        p=new int[n];
        ch=new int[n+1];

        P0808 p0808 = new P0808();

        for(int i=0; i<n; i++){
            b[i]=p0808.combi(n-1, i);
        }

        p0808.dfs(0, 0);
    }

    public void dfs(int level, int sum){
        if(flag) return;
        if(level==n){
            if(sum==f){
                for(int x : p) System.out.print(x+" ");
                flag=true;
            }
        }
        else{
            for(int i=1; i<=n; i++){
                if(ch[i]==0){
                    ch[i]=1;
                    p[level]=i;
                    dfs(level+1, sum+(p[level]*b[level]));
                    ch[i]=0;
                }
            }
        }
    }
}
