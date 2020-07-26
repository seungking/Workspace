package greedy1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int[] lost = {2,3};
		int[] reserve = {3,4};
		
        int answer = 0;
        ArrayList<Integer> tlost = new ArrayList<Integer>();
        for(int i=0; i<lost.length; i++)tlost.add(lost[i]);
        ArrayList<Integer> treserve = new ArrayList<Integer>();
        for(int i=0; i<reserve.length; i++)treserve.add(reserve[i]);
        
        for(int i=1; i<n+1; i++) {
            if(tlost.indexOf(i)<0) answer++;
            else if(treserve.indexOf(i)>=0){
                treserve.remove(treserve.indexOf(i));
                answer++;
            }
            else if(treserve.indexOf(i-1)>=0 && tlost.indexOf(i-1)<0){
                    treserve.remove(treserve.indexOf(i-1));
                    answer++;
                }
            else if(treserve.indexOf(i+1)>=0 && tlost.indexOf(i+1)<0){
                treserve.remove(treserve.indexOf(i+1));
                answer++;
            }
        }
        
	}

}
