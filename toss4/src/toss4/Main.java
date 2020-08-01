package toss4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void Main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int n = Integer.parseInt(input);
		String[][] arr = new String[n][];
		HashMap<String,Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			input = br.readLine();
			arr[i] = input.split("\\,");
			if(map.get(arr[i][0])>=0) map.put(arr[i][1],map.get(arr[i][1])+Integer.parseInt(arr[i][1]));
			else map.put(arr[i][0], Integer.parseInt(arr[i][1]));
		}
		
		
	}

}
