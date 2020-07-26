package kakao_test3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
		ArrayList<String> label = new ArrayList<String>();
		
		for(int i=0; i<gems.length; i++) if(label.indexOf(gems[i])==-1)label.add(gems[i]);
		
		int mins=999;
		int mine=9999;
		for(int s=0; s<gems.length; s++) {
			ArrayList<String> done = new ArrayList<String>();
			for(int e=s; e<gems.length; e++) {
				if(done.indexOf(gems[e])==-1) done.add(gems[e]);
				if(done.size()==label.size()) {
					if((e-s)==(mine-mins)) {
						if(s<mins) {
							mins=s+1;
							mine=e+1;
						}
					}
					if(e-s<mine-mins) {
						mins=s+1;
						mine=e+1;
					}
					break;
				}
			}
		}
		
        int[] answer = {mins,mine};
	}

}
