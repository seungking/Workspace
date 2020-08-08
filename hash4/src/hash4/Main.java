package hash4;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500,600,150,800,2500};
		
		ArrayList<String> genre = new ArrayList<>();
		ArrayList<ArrayList<Integer>> play = new ArrayList<>();
		HashMap<Integer, Integer> info = new HashMap<>();
		HashMap<String, Integer> sum = new HashMap<>();
		
		for(int i=0; i<genres.length; i++) {
			if(genre.indexOf(genres[i])>=0)	play.get(genre.indexOf(genres[i])).add(plays[i]);
			else {
				genre.add(genres[i]);
				ArrayList<Integer> temp = new ArrayList<>();
				temp.add(plays[i]);
				play.add(temp);
			}
			
			if(sum.get(genres[i])!=null) sum.put(genres[i],sum.get(genres[i])+plays[i]);
			else sum.put(genres[i],plays[i]);
			
			if(info.get(plays[i])==null) info.put(plays[i],i);
			else if(info.get(plays[i])>i) info.put(plays[i],i);
		}
		
	    ArrayList<Integer> answer = new ArrayList<>();
	    
		List<String> keySetList = new ArrayList<>(sum.keySet());
		Collections.sort(keySetList, (o1, o2) -> (sum.get(o2).compareTo(sum.get(o1))));
		for(String key : keySetList) {
			
			ArrayList<Integer> temp = play.get(genre.indexOf(key));
			Collections.sort(temp);
			Collections.reverse(temp);
			
			answer.add(info.get(temp.get(0)));
			if(temp.size()>1)answer.add(info.get(temp.get(1)));
		}	`
		
		for(int i : answer) System.out.println(i);
  
	}

}
