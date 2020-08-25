package com.company;

import java.awt.*;
import java.nio.channels.Pipe;
import java.util.*;
public class Main {

    static int answer = Integer.MAX_VALUE;
    static int n=0, m=0;
    public static void main(String[] args) {
        // write your code here
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(solution(maps));
    }

    public static int solution(int[][] maps){

        n = maps.length;
        m = maps[0].length;

        int[][] visited = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                visited[i][j]=0;
            }
        }

       return bfs(0, 0, visited, maps);
    }

//    public static void dfs(int i, int j, Boolean[][] visited, int[][] maps, int count){
//
//        if(i == n-1 && j == m-1){
//            if(count<answer) answer=count;
//            return;
//        }
//        if(count>answer) return;
//
//        if(visited[i][j]==true) return;
//        visited[i][j] = true;
//
//        if(i>1) dfs(i-1,j,visited,maps,count+1);
//        if(j>1) dfs(i,j-1,visited,maps,count+1);
//        if(i<n-1) dfs(i+1,j,visited,maps,count+1);
//        if(j<m-1) dfs(i,j+1,visited,maps,count+1);
//
//        return;
//    }
    public static int bfs(int i, int j, int[][] visited, int[][] maps){

        int[] dx = {0,0,-1,1};
        int[] dy = {1,-1,0,0};

        Queue<Point> q = new LinkedList<>();

        q.add(new Point(i,j));
        visited[i][j] = 1;

        while(!q.isEmpty()){
            Point cur = q.poll();
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];

                if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if(visited[nx][ny]>0 || maps[nx][ny]==0) continue;

                q.add(new Point(nx,ny));
                visited[nx][ny] = visited[cur.x][cur.y]+1;
            }
        }

        return visited[n-1][m-1]==0 ? -1 : visited[n-1][m-1];
    }
}