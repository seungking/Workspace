package toss5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		
		int n = Integer.parseInt(input);
		String[] arr = new String[n];
		for(int i=0; i<n; i++) {
			input = br.readLine();
		    arr[i] = input.replaceFirst(",", "");
		    
		    String temp="";
		    if(arr[i].length()>=12) {
		    	if(temp.length()>3)
		    		temp = temp + arr[i] + "," + arr[i].substring(1,arr[i].length()-13);
		    	else 
		    		temp = temp + arr[i].substring(0,arr[i].length()-13);
		    }
		    if(arr[i].length()>8) {
		    	if(temp.length()>3)
		    		temp = temp + arr[i] + "," + arr[i].substring(1,arr[i].length()-7);
		    	else 
		    		temp = temp + arr[i].substring(0,arr[i].length()-7);
		    }
		    if(arr[i].length()>4) {
		    	if(temp.length()>3)
		    		temp = temp + arr[i] + "," + arr[i].substring(1,arr[i].length()-5);
		    	else 
		    		temp = temp + arr[i].substring(0,arr[i].length()-5);
		    }
		    else {
		    	if(temp.length()>3)
		    		temp = temp + arr[i] + "," + arr[i].substring(1,arr[i].length()-1);
		    	else 
		    		temp = temp + arr[i].substring(0,arr[i].length()-1);
		    }
		}
		
		
		
		
	}

}
