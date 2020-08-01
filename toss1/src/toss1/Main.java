package toss1;

import java.util.*;
import java.io.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
//		
//		String arr[] = input.split(",");
//		
//		String alpha = Integer.toHexString((int)Math.round((Integer.parseInt(arr[1]) * 2.55))).toUpperCase(); 
//		alpha = (Integer.toHexString((int)Math.round((Integer.parseInt(arr[1]) * 2.55))).toUpperCase().equals("0")) ? "00" : Integer.toHexString((int)Math.round((Integer.parseInt(arr[1]) * 2.55))).toUpperCase();  
//		System.out.print("#" + alpha + arr[0].substring(1));
//
		/////////////////////////////////////////////////////////////////
//		int n = Integer.parseInt(input);
//		String[][] arr = new String[n][];	
//		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		ArrayList<String>check = new ArrayList<>();
//		int[] fcheck = new int[n];
//		
//		for(int i=0; i<n; i++) {
//			input = br.readLine();
//			arr[i] = input.split("\\,");
//			if(check.indexOf(arr[i][0])>=0) 
//				{
//				map.put(arr[i][0],map.get(arr[i][0])+Integer.parseInt(arr[i][1]));
//				fcheck[check.indexOf(arr[i][0])]++;
//				continue;
//				}
//			else check.add(arr[i][0]);
//			fcheck[check.indexOf(arr[i][0])]++;
//			map.put(arr[i][0], Integer.parseInt(arr[i][1]));
//		}
//
//		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());
//		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
//			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2){
//				return obj2.getValue().compareTo(obj1.getValue());
//			}
//		});
//		
//		System.out.println(list_entries.get(0).getKey());
//		
//		int[] temp = fcheck.clone();
//		Arrays.sort(temp);
//		
//		
//		ArrayList<String>atemp = new ArrayList<String>();
//		for(int i=0; i<fcheck.length; i++) {
//			if(fcheck[i]==temp[temp.length-1]) {
//				atemp.add(check.get(i));
//			}
//		}
//		
//
//		String[] aa = new String[atemp.size()];
//		for(int i=0; i<atemp.size(); i++) {
//			aa[i] = atemp.get(i);
//		}
//		Arrays.sort(aa, String.CASE_INSENSITIVE_ORDER);
//		for(int i=0; i<aa.length; i++) {
//			if(i>0)System.out.print(",");
//			System.out.print(aa[i]);
//		}
		
		/////////////////////////////////////////////////////////////////
		
		int n = Integer.parseInt(input);
		String[] arr = new String[n];
		for(int i=0; i<n; i++) {
			input = br.readLine();
		    arr[i] = input.replace(",", "");
		    
		    String temp="";
		    if(arr[i].length()>=12) {
		    	if(arr[i].length()-12>3)
		    		temp = temp + arr[i].substring(0,1) + "," + arr[i].substring(1,arr[i].length()-12);
		    	else 
		    		temp = temp + arr[i].substring(0,arr[i].length()-12);
		    	
		    	arr[i] = arr[i].substring(arr[i].length()-12,arr[i].length());
		    }
		    if(arr[i].length()>8) {
		    	if(arr[i].length()-8>3)
		    		temp = temp + arr[i].charAt(0) + "," + arr[i].substring(1,arr[i].length()-8);
		    	else 
		    		temp = temp + arr[i].substring(0,arr[i].length()-8);
		    	arr[i] = arr[i].substring(arr[i].length()-8,arr[i].length());
		    }
		    if(arr[i].length()>4) {
		    	if(arr[i].length()-4>3)
		    		temp = temp + arr[i].charAt(0) + "," + arr[i].substring(1,arr[i].length()-4);
		    	else 
		    		temp = temp + arr[i].substring(0,arr[i].length()-4);
		    	arr[i] = arr[i].substring(arr[i].length()-4,arr[i].length());
		    }
		    
	    	if(arr[i].length()>3)
	    		temp = temp + arr[i].charAt(0) + "," + arr[i].substring(1,arr[i].length());
	    	else 
	    		temp = temp + arr[i].substring(0,arr[i].length());
		    
		    System.out.println(temp);
		}
		
	}

}
