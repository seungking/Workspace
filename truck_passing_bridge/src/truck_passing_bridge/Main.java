package truck_passing_bridge;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bridge_length=100;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

//		
		int[] move = new int[truck_weights.length];
		Arrays.fill(move,-1);
		int curweight=0, startorder=0, currentorder=0, answer=0;
		while(startorder!=truck_weights.length) {
			
			for(int i=startorder; i<currentorder; i++) {
				if(move[i]<bridge_length) move[i]++;
				if(move[i]>=bridge_length) {
					startorder++;
					curweight-=truck_weights[i];
				}
			}
			
			if(currentorder<truck_weights.length && 
					(curweight+truck_weights[currentorder])<=weight) {
				curweight+=truck_weights[currentorder];
				move[currentorder]++;
				currentorder++;
			}
			
			answer++;
		}
		
		
		System.out.print(String.valueOf(answer));
	}

}
