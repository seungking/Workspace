package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] land={{1,2},{2,3}};
        int P=3;
        int Q=2;
        System.out.println(solution(land, P, Q));
    }
    public static long solution(int[][] land, int P, int Q) {

        long answer = Long.MAX_VALUE;

        int max=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0; i< land.length; i=i+1){
            for(int j=0; j<land[i].length; j=j+1){
                if(land[i][j]>max)max = land[i][j];
                if(land[i][j]<min)min = land[i][j];
            }
        }

        while(min<=max){
            int mid = (min+max)/2;

            long cost1 = cost(mid, land, P,Q);
            long cost2 = cost(mid+1, land, P,Q);

            if(cost1 <= cost2){
                answer = cost1;
                max = mid-1;
            }
            else{
                answer = cost2;
                min = mid+1;
            }

        }

        return answer;
    }

    public static long cost(long k, int[][]land, int P, int Q){
        long c = 0;
        for (int i = 0; i < land.length; i=i+1) {
            for (int j = 0; j < land[i].length; j=j+1) {
                if(k==land[i][j])continue;
                if(k-land[i][j]>0) c=c+(long)((k-land[i][j])*P);
                else if(k-land[i][j]<0) c=c+(long)((land[i][j]-k)*Q);
            }
        }
        return c;
    }

}
