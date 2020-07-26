package hash1;

import java.util.ArrayList;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
//		ArrayList<String> part = new ArrayList<String>(Arrays.asList(participant));
//		
//		for(int i=0; i<completion.length; i++) {
//			if(part.indexOf(completion[i])>=0) {
//				part.remove(part.indexOf(completion[i]));
//			}
//		}
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		for(int i=0; i<participant.length-1; i++) {
			if(!participant[i].equals(completion[i])) {
				System.out.print(participant[i]);
				return;
			}
		}
		
		System.out.print(participant[participant.length-1]);
		
	}

}
