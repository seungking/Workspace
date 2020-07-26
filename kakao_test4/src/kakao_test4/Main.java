package kakao_test4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static ArrayList<Integer> results = new ArrayList<Integer>();
	public static ArrayList<Integer> results2 = new ArrayList<Integer>();
	
	public static void main(String[] args) {

//		int[][] board = {{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1},{0,0,1,0,0,0,1,0},{0,1,0,0,0,1,0,0},{1,0,0,0,0,0,0,0}};
		
		int[][]board = {{0,0},{0,0}};
		run(board, 0, 0, 0, 0, 2, 2);
		run(board, 0, 0, 0, 0, 3, 3);
		
		Collections.sort(results);
		
	}
	
	public static void run(int[][] board, int x, int y, int a, int b, int d, int exd) {
		
		if(x>=board[0].length|y>=board[0].length) return;
		if(x==board[0].length-1&&y==board[0].length-1) {
			results.add(a*100+b*500);
			return;
		}
		
		
		int count=0;
		if(d==1) {
			if(x<=0) return;
			if(x<board[0].length-1)if(board[x+1][y]==1) count++;
			if(y>0) if(board[x][y-1]==1)count++;
			if(y<board[0].length-1)if(board[x][y+1]==1)count++;
			if(count==3)return;
		}
		if(d==2) {
			if(x>=board[0].length-1) return;
			if(x>0) if(board[x-1][y]==1) count++;
			if(y>0) if(board[x][y-1]==1)count++;
			if(y<board[0].length-1)if(board[x][y+1]==1)count++;
			if(count==3)return;
		}
		if(d==3) {
			if(y>=board[0].length-1) return;
			if(x>0) if(board[x-1][y]==1) count++; 
			if(x<board[0].length-1)if(board[x+1][y]==1) count++;
			if(y>0) if(board[x][y-1]==1)count++;
			if(count==3)return;
		}
		if(d==4) {
			if(y<=0) return;
			if(x>0) if(board[x-1][y]==1) count++; 
			if(x<board[0].length-1)if(board[x+1][y]==1) count++;
			if(y<board[0].length-1)if(board[x][y+1]==1)count++;
			if(count==3)return;
		}
		
		if(x>0) {
		if(exd==3)run(board, x-1, y, a, b+1, 1, d);
		else run(board, x-1, y, a+1, b, 1, d);
		}
		
		if(x<board[0].length) {
		if(exd==3)run(board, x+1, y, a, b+1, 2, d);
		else run(board, x+1, y, a+1, b, 2, d);
		}
		
		if(y<board[0].length) {
		if(exd==1|exd==2)run(board, x, y+1, a, b+1, 3, d);
		else run(board, x, y+1, a+1, b, 3, d);
		}
		
		if(y>0) {
		if(exd==1|exd==2)run(board, x, y-1, a, b+1, 4, d);
		else run(board, x, y-1, a+1, b, 4, d);
		}
	}
}
