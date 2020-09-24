package dfsbfs4;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<String>> result = new ArrayList<>();
//		String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
//		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "SFO"}, {"SFO", "ICN"}, {"SFO", "QRE"}};
		
		for(int i=0; i<tickets.length; i++) {
			if(tickets[i][0].equals("ICN")) {
				boolean[] visited = new boolean[tickets.length];
				ArrayList<String> temp = new ArrayList<>();
				temp.add(tickets[i][0]);
				temp.add(tickets[i][1]);
				dfs(i,tickets,visited,temp);
				boolean check=false;
				for(boolean a : visited) {
					if(a==false) {
						check=true;
						break;
					}
				}
				if(check)continue;
				result.add(temp);
			}
		}
		
		HashMap<String,Integer> map = new HashMap<>();
		int index=0;
		for(ArrayList<String> a : result) {
			map.put(a.toString(),index);
			index++;
		}
		
		List<String> keySetList = new ArrayList<>(map.keySet());
		Collections.sort(keySetList);
		
		String[] answer = result.get(map.get(keySetList.get(0))).toArray(new String[result.get(map.get(keySetList.get(0))).size()]);
		
		System.out.print(answer.toString());
	}

	public static void dfs(int i, String[][] tickets, boolean[] visited, ArrayList<String> temp) {
		
		if(visited[i]) return;
		
		visited[i]=true;
		for(int j=0; j<tickets.length; j++) {
			if(tickets[i][1].equals(tickets[j][0])&&!visited[j]) {
				temp.add(tickets[j][1]);
				dfs(j,tickets,visited,temp);
			}
		}
		
		return;
	}
}
