package hash2;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] phone_book = {"119", "97674223", "1195524421"};
		String[] phone_book = {"123", "456", "789"};
		List<String> arr = new ArrayList<>();
		for(String temp : phone_book) arr.add(temp);
		
		for(int i=0; i<arr.size(); i++) {
			for(int j=i+1; j<arr.size(); j++) {
				if(arr.get(i).length()>=arr.get(j).length()) {
					if(arr.get(i).substring(0, arr.get(j).length()).contains(arr.get(j)))  {
						System.out.print("false");
						return;
					}
				}
				else {
					if(arr.get(j).substring(0, arr.get(i).length()).contains(arr.get(i))) {
						System.out.print("false");
						return;
					}
				}
			}
		}
		
		System.out.print("true");
	}

}
