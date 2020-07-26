package greedy4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] people = {10,20,30,40,50,60,70,80,90};
		int limit = 100;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i : people)arr.add(i);
		Collections.sort(arr);
		
		int start = 0;
		int end = arr.size()-1;
		int answer = 0;
		while(end-start>=0) {
			if(arr.size()>1 && arr.get(start)+arr.get(end)<=limit) {
				start++;
				end--;
			}
			else {
				end--;
			}
			answer++;
		}
		
		System.out.print(answer);
	}

}
