package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=5000;
        System.out.println(solution(n));
    }
    public static int solution(int n) {

        int ans = 0;

        while(n>0){
            if(n%2==1){
                n--;
                ans++;
            }
            n/=2;
        }

        return ans;
    }


//    public static void dfs(int n, int cur, int count){
//
//        if(cur>n | count>ans) return;
//        if(cur==n && count<ans) {
//            ans=count;
//            return;
//        }
//
//        for(int i=1; i<=n; i++){
//            if((cur+i)<=n | (count+i)<ans) dfs(n, cur+i, count + i);
//        }
//        if((cur*2)<=n) dfs(n, cur*2, count);
//
//        return;
//    }
}
