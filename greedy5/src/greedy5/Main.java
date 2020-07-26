package greedy5;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		print(solution({{-2,-1}, {1,2},{-3,0}})) #2
//		print(solution({{0,0},})) #1
//		print(solution({{0,1}, {0,1}, {1,2}})) #1
//		print(solution({{0,1}, {2,3}, {4,5}, {6,7}})) #4
//		print(solution({{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}})) #2
//		print(solution({{-20,15}, {-14,-5}, {-18,-13}, {-5,-3}})) #2
//		print(solution({{-20,15}, {-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}})) #2
		
		int[][] routes = {{-20,15}, {-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
		
		Arrays.sort(routes, new Comparator<int[]>() {
		    public int compare(int[] o1, int[] o2) { return o1[0] - o2[0]; }
		});
	
		int p=routes[0][1], answer = 1;
		
		for(int i=0; i<routes.length; i++) {
			if(p>=routes[i][0])  p = Math.min(p, routes[i][1]);
			else {
				answer++;
				p = routes[i][1];
			}
		}
		
		System.out.print(answer);
	}

}
