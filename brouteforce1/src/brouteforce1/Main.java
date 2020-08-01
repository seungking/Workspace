package brouteforce1;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] answers = {5,1,2,3,4,5};
		
		int[] a = {1,2,3,4,5};
		int[] b = {2,1,2,3,2,4,2,5};
		int[] c = {3,3,1,1,2,2,4,4,5,5};
		
		int aa=0,bb=0,cc=0;
		for(int i=0; i<answers.length; i++) {
			if(answers[i]==a[i%a.length])aa++;
			if(answers[i]==b[i%b.length])bb++;
			if(answers[i]==c[i%c.length])cc++;
		}
		
		int max = Math.max(aa, Math.max(bb,cc));
		
		List<Integer> answer = new ArrayList<>();
		if(max==aa) answer.add(1);
		if(max==bb) answer.add(2);
		if(max==cc) answer.add(3);
		
		int[] fanswer = new int[answer.size()];
		for(int i=0; i<answer.size(); i++)fanswer[i] = answer.get(i);
		
		for( int a2 : answer) System.out.println(a2);
		
	}

}
