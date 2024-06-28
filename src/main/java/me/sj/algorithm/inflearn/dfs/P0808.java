package me.sj.algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * 수열 추측하기
 * 가장 윗줄에 1부터 N까지의 숫자가 한 개씩 적혀 있다. 그리고 둘째 줄부터 차례대로 파스칼의 삼각형처럼 위의 두개를 더한 값이 저장되게 된다.
 *
 * 예를 들어 N이 4 이고 가장 윗 줄에 3 1 2 4 가 있다고 했을 때, 다음과 같은 삼각형이 그려진다.
 *
 * N과 가장 밑에 있는 숫자가 주어져 있을 때 가장 윗줄에 있는 숫자를 구하는 프로그램을 작성하시오.
 *
 * 단, 답이 여러가지가 나오는 경우에는 사전순으로 가장 앞에 오는 것을 출력하여야 한다.
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
