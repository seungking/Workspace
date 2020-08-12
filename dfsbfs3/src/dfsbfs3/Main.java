package dfsbfs3;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<String>> result = new ArrayList<>();
		String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
		
		boolean[] visited = new boolean[tickets.length];
		for(int i=0; i<tickets.length; i++) {
			if(tickets[i][0].equals("ICN")) {
				ArrayList<String> temp = new ArrayList<>();
				temp.add("ICN");
				dfs(i,tickets,visited,temp);
				result.add(temp);
			}
		}
		
		for(ArrayList<String> a : result) {
			for(String b : a) {
				System.out.print(b + " ");
			}
		}
	}

	public static void dfs(int i, String[][] tickets, boolean[] visited, ArrayList<String> temp) {
		
		if(visited[i]) return;
		
		visited[i]=true;
		for(int j=0; j<tickets.length; j++) {
			if(tickets[i][1].equals(tickets[j][0])) {
				temp.add(tickets[i][1]);
				dfs(j,tickets,visited,temp);
			}
		}
		
		return;
	}
}
