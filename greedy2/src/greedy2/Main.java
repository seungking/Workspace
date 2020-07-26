package greedy2;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String number = "999";
		int k = 2;
		//////////////////////////////////////////////////
		 String answer = "";
		StringBuilder sb = new StringBuilder(number);
		int len = sb.length();
		int first=0, second=0;
		int cnt=0;
		
		while(k>0){
			if(cnt==len-1) {
				answer = sb.substring(0,len-k);
				System.out.println(answer);
				return;
			}
			else{	
				cnt++;
				first = sb.charAt(cnt-1)-'0';
				second = sb.charAt(cnt)-'0';
				if(first<second) {
					k--;
					cnt=0;
					sb.delete(cnt-1, cnt);
					len=sb.length();
				}
			}
		}
		
		//////////////////////////////////////////////////

		System.out.println(sb.toString());
        
        
	}

}
