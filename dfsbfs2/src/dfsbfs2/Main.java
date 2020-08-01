package dfsbfs2;

public class Main {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		
		int answer=0;
		boolean[] visited = new boolean[n];
		for(int i=0; i<n; i++) {
			answer += dfs(i,computers,visited);
		}
		
		System.out.println(answer);
	}

	public static int dfs(int i, int[][] computers, boolean[] visited) {
		
		if(visited[i]) return 0;
		
		visited[i] = true;
		for(int j=0; j<computers[i].length; j++) {
			if(computers[i][j]==1) dfs(j,computers,visited);
		}
		
		return 1;
	}
}
// 모든 대각선 방향
//static int[] dx = { 0, 0, 1, -1, 1, -1, 1, -1 };
//static int[] dy = { -1, 1, 0, 0, -1, 1, 1, -1 };
// 모든 상하좌우
//static int[] dx = { 0, 0, -1, 1 };
//static int[] dy = { -1, 1, 0, 0 };
///* DFS */
//private static void dfs(int x, int y, int count, int w, int h) {
//    check[x][y] = count;
//
//    for (int i = 0; i < dx.length; i++) {
//        int nx = x + dx[i];
//        int ny = y + dy[i];
//        if (0 <= nx && nx < h && 0 <= ny && ny < w) {
//            if (arr[nx][ny] == 1 && check[nx][ny] == 0)
//                dfs(nx, ny, count, w, h);
//        }
//    }
//}
