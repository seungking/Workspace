package toss2;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int n = Integer.parseInt(input);
		String[][] arr = new String[n][];
		int min=999;
		for(int i=0; i<n; i++) {
			input = br.readLine();
			arr[i] = input.split("\\.");
			if(min>arr[i].length)min = arr[i].length;
		}
				
		String result = "";
		int count=0;
		int check=0;
		for(int i=0; i<min-1; i++) {
			count=0;
			for(int j=1; j<n; j++) {
				if(arr[0][i].equals(arr[j][i])) count++;
			}
			if(count==n-1) {
				if(i>=1) result = result + ".";
				result = result + arr[0][i];
				check++;
			}
		}
		
		result = (check>1)? result : "¾øÀ½";
		System.out.print(result);
		
		
	}

}
