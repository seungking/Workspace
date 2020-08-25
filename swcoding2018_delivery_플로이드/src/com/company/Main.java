package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int N = 5;
        int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        int K = 3;

        System.out.println(String.valueOf(solution(N,road,K)));
    }

    public static int solution(int N, int[][] road, int K) {

        int answer = 0;

        int[][] d = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++) {
                if(j==i)d[i][j]=0;
                else d[i][j] = 500001;
            }
        }

        for(int i=0; i<road.length; i++) {
            if(d[road[i][0]-1][road[i][1]-1]>road[i][2]) {
                d[road[i][0] - 1][road[i][1] - 1] = road[i][2];
                d[road[i][1] - 1][road[i][0] - 1] = road[i][2];
            }
        }

        for(int i=0; i<N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {

                    if(i==j || d[i][j]==Integer.MAX_VALUE) continue;
                    if(d[j][i]+d[i][k]<d[j][k])
                        d[j][k] = d[j][i]+d[i][k];

                }
            }
        }

        for(int i=0; i<N; i++){
            if(d[0][i]<=K) answer++;
        }

        return answer;
    }
}
