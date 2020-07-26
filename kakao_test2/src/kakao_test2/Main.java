package kakao_test2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expression = "100-200*300-500+20";
		String[] array = expression.split("");
		ArrayList<String> arr = new ArrayList<String>();
		
		String temp = "";
		for(int i = 0; i<array.length; i++) {
			if(array[i].contains("-")|array[i].contains("+")|array[i].contains("*")) {
				arr.add(temp);
				arr.add(array[i]);
				temp = "";
			}
			else {
				temp = temp + array[i];
			}
		}
		arr.add(temp);

		ArrayList<Character> temp1 = new ArrayList<Character>();
		temp1.add('*');
		temp1.add('+');
		temp1.add('-');
		
		ArrayList<Character> temp2 = new ArrayList<Character>();
		temp2.add('*');
		temp2.add('-');
		temp2.add('+');
		
		ArrayList<Character> temp3 = new ArrayList<Character>();
		temp3.add('+');
		temp3.add('*');
		temp3.add('-');
		
		ArrayList<Character> temp4 = new ArrayList<Character>();
		temp4.add('+');
		temp4.add('-');
		temp4.add('*');
		
		ArrayList<Character> temp5 = new ArrayList<Character>();
		temp5.add('-');
		temp5.add('+');
		temp5.add('*');
		
		ArrayList<Character> temp6 = new ArrayList<Character>();
		temp6.add('-');
		temp6.add('*');
		temp6.add('+');
		
		ArrayList<ArrayList<Character>> box = new ArrayList<ArrayList<Character>>();
		box.add(temp1);
		box.add(temp2);
		box.add(temp3);
		box.add(temp4);
		box.add(temp5);
		box.add(temp6);
				
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int k=0; k<box.size(); k++) {
			ArrayList<String> arr2 = new ArrayList<String>();
			for(int i=0; i<arr.size(); i++)	arr2.add(arr.get(i));
			for(int j=0; j<3; j++) {
				for(int i=0; i<arr2.size(); i++) {
					int a = arr2.indexOf(box.get(k).get(j).toString());
					if(a!=-1){
						if(box.get(k).get(j)=='*') {
							int num = Integer.parseInt(arr2.get(a-1)) * Integer.parseInt(arr2.get(a+1));
							arr2.remove(a-1);
							arr2.remove(a-1);
							arr2.remove(a-1);
							arr2.add(a-1, Integer.toString(num));
						}
						else if(box.get(k).get(j)=='+') {
							int num = Integer.parseInt(arr2.get(a-1)) + Integer.parseInt(arr2.get(a+1));
							arr2.remove(a-1);
							arr2.remove(a-1);
							arr2.remove(a-1);
							arr2.add(a-1, Integer.toString(num));
						}
						else {
							int num = Integer.parseInt(arr2.get(a-1)) - Integer.parseInt(arr2.get(a+1));
							arr2.remove(a-1);
							arr2.remove(a-1);
							arr2.remove(a-1);
							arr2.add(a-1, Integer.toString(num));
						}
					}
					else break;
				}
			}
			
			int aaa =Integer.parseInt(arr2.get(0)); 
			if(aaa<0)result.add(-aaa);
			else result.add(aaa);
		}
		
		Collections.sort(result);
		long answer = result.get(result.size()-1);
		
		

	}

}
