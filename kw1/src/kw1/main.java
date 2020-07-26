package kw1;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println("Hello Goorm! Your input is " + input);
		String[] split = input.split(" ");
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<Integer.parseInt(split[0]); i++){
			input = br.readLine();
			String[] value = input.split(" ");
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int j=0; j<Integer.parseInt(split[1]); j++){
				temp.add(Integer.parseInt(value[j]));
			}
			arr.add(temp);
		}
		
		ArrayList<ArrayList<Integer>> c = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<Integer.parseInt(split[2]); i++){
			input = br.readLine();
			String[] value = input.split(" ");
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int j=0; j<4; j++){
				temp.add(Integer.parseInt(value[j]));
			}
			c.add(temp);
		}
		
		System.out.print("a");
		
		for(int i=0; i<c.size(); i++) {
			
			int save1 = arr.get(c.get(i).get(0)-1).get(c.get(i).get(3)-1);
			for(int x = c.get(i).get(3)-2; x>=c.get(i).get(1)-1; x--) {
				arr.get(c.get(i).get(0)-1).set(x+1, arr.get(c.get(i).get(0)-1).get(x));
			}
			
			int save2 = arr.get(c.get(i).get(2)-1).get(c.get(i).get(3)-1);
			for(int y = c.get(i).get(2)-1; y>c.get(i).get(1)-1; y--) {
				if(y==c.get(i).get(1))arr.get(y).set(c.get(i).get(3)-1, save1);
				else arr.get(y).set(c.get(i).get(3)-1, arr.get(y-1).get(c.get(i).get(3)-1));
			}
			
			int save3 = arr.get(c.get(i).get(2)-1).get(c.get(i).get(1)-1);
			for(int x = c.get(i).get(1)-1; x<c.get(i).get(3)-1; x++) {
				if(x==c.get(i).get(1)-1)arr.get(c.get(i).get(2)-1).set(x, save2);
				else arr.get(c.get(i).get(2)-1).set(x, arr.get(c.get(i).get(2)-1).get(x+1));
			}
			
			for(int y = c.get(i).get(0)-1; y<c.get(i).get(2)-1; y++) {
				if(y==c.get(i).get(2)-2)arr.get(y).set(c.get(i).get(3)-1, save3);
				else arr.get(y).set(c.get(i).get(1)-1, arr.get(y).get(c.get(i).get(1)-1));
			}
			
		}
		
//		if(x<c.get(i).get(2)) {
//			for(int y = c.get(i).get(1)-1; x<c.get(i).get(3)-1; y++) {
//				
//			}
//		}
	}
}