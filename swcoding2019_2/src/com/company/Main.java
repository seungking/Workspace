package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int answer = Integer.MAX_VALUE;
    static int n=0, m=0;
    public static void main(String[] args) {
        // write your code here
        int[][] land = {{1,4,8,10},{5,5,5,5},{10,10,10,10},{10,10,10,20}};
        int height=3;
        System.out.println(solution(land,height));
    }

    public static int solution(int[][] land, int height){

        n = land.length;
        m = land[0].length;

        int[] dx = {0,0,-1,1};
        int[] dy = {1,-1,0,0};
        int[][] result = new int[n][m];
        for(int i=0; i<n; i++)
            Arrays.fill(result[i],Integer.MAX_VALUE);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                for(int k=0; k<4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx<0 || ny<0 || nx>=n || ny>=m) continue;

                    int gap = Math.abs(land[i][j]-land[nx][ny]);
                    if(gap<height) result[nx][ny] = 0;
                    if(gap<result[nx][ny]) result[nx][ny] = gap;
                }
            }
        }
        return answer;
    }

    public static void bfs(int i, int j, int[][] maps, int height){

        int[][] visited = new int[n][m];
        int[][] reach = new int[n][m];

        int result = 0;
        int[] dx = {0,0,-1,1};
        int[] dy = {1,-1,0,0};

        Queue<Point> q = new LinkedList<>();

        q.add(new Point(i,j));
        visited[i][j] = 1;
        reach[i][j] = 0;

//        while(!q.isEmpty()){
//            Point cur = q.poll();
//            for(int k=0; k<4; k++){
//                int nx = cur.x + dx[k];
//                int ny = cur.y + dy[k];
//
//                if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
//                if(visited[nx][ny]==1) continue;
//
//                visited[nx][ny]=1;
//                reach[nx][ny]=1;
//                q.add(new Point(nx,ny));
//                if(Math.abs(maps[cur.x][cur.y]-maps[nx][ny])>height && visited[nx][ny]==0)
//                {
//                    result+=Math.abs(maps[cur.x][cur.y]-maps[nx][ny]);
//                    System.out.println(Math.abs(maps[cur.x][cur.y]-maps[nx][ny]));
//                }
//                if(result>answer) return;
//            }
//        }
        System.out.println("result : " + String.valueOf(result));
        if(result<answer)
            answer=result;

        return;
    }
}
