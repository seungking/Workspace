package com.company;

import java.awt.*;

public class Main {

    static int answer=Integer.MAX_VALUE;

    public static void main(String[] args) {

//        int[][] board = {{0, 0, 1, 0}, {0, 0, 0, 0}, {0, 1, 0, 1}, {1, 0, 0, 0}};
        int[][] board = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        System.out.println(solution(board));
    }

    public static int solution(int[][] board) {

        int[][] check = new int[board.length][board.length];
        dfs(new Point(1, 0),check, board, 3,100);
        dfs(new Point(0, 1),check, board, 0,100);

        return answer;
    }

    private static void dfs(Point p, int[][] check, int[][] board, int dir, int count) {

        if(count>answer | check[p.x][p.y]==1) return;
        if(p.x== board.length-1 && p.y== board.length-1){
            if(count<answer) answer = count;
            return;
        }

        check[p.x][p.y] = 1;

        //dir = 0 상
        //dir = 1 하
        //dir = 2 좌
        //dir = 3 우
        if((p.x< board.length-1 && board[p.x+1][p.y]==1) && (p.y>0 && board[p.x][p.y-1]==1) && p.x>0 && board[p.x-1][p.y]==0) {
            if(dir==2)
                dfs(new Point(p.x-1, p.y),check, board, 2,count+100);
            else
                dfs(new Point(p.x-1, p.y),check, board, 2,count+600);
        }
        if(p.x< board.length-1 && board[p.x+1][p.y]==0) {
            if(dir==3)
                dfs(new Point(p.x+1, p.y),check, board, 3,count+100);
            else
                dfs(new Point(p.x+1, p.y),check, board, 3,count+600);
        }
        if((p.x< board.length-1 && board[p.x+1][p.y]==1) && (p.y>0 && board[p.x][p.y-1]==1) && p.y>0 && board[p.x][p.y-1]==0) {
            if(dir==1)
                dfs(new Point(p.x, p.y-1),check, board, 1,count+100);
            else
                dfs(new Point(p.x, p.y-1),check, board, 1,count+600);
        }
        if(p.y< board.length-1 && board[p.x][p.y+1]==0) {
            if(dir==0)
                dfs(new Point(p.x, p.y+1),check, board, 0,count+100);
            else
                dfs(new Point(p.x, p.y+1),check, board, 0,count+600);
        }

    }
}
