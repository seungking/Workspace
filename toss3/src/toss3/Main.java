package toss3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int n = Integer.parseInt(input);
		String[][] arr1 = new String[n+1][];
		String[][] arr2 = new String[n+1][];
		int[] dates = new int[n+1];
		int[] times = new int[n+1];
		String[] temp = new String[n+1];
		for(int i=0; i<n+1; i++) {
			input = br.readLine();
			temp = input.split(" ");
			
			arr1[i] = temp[0].toString().split("-");
			if(arr1[i].length!=3) {
				System.out.println("error");
				continue;
			}
			dates[i] = Integer.parseInt(arr1[i][0].toString())*365 
					+ Integer.parseInt(arr1[i][1].toString())*30
					+ Integer.parseInt(arr1[i][2].toString());
			
			arr2[i] = temp[1].toString().split(":");
			if(arr2[i].length!=3) {
				System.out.println("error");
				continue;
			}
			times[i] = Integer.parseInt(arr2[i][0].toString())*3600
					+ Integer.parseInt(arr2[i][1].toString())*60
					+ Integer.parseInt(arr2[i][2].toString());
			
			if(i>0) {
				int date = dates[0]-dates[i];
				int time = times[0]-times[i];
				
				if(date<0) System.out.println("error");
				else if(date>=365) {
					System.out.println(arr1[i][0].toString().substring(2) + "년 "
							 + ((Integer.parseInt(arr1[i][1].toString())<10)? arr1[i][1].toString().substring(1) : arr1[i][1]) + "월 "
							+ ((Integer.parseInt(arr1[i][2].toString())<10)? arr1[i][2].toString().substring(1) : arr1[i][2]) + "일");
				}
				else if(date==0 && time<60) {
					System.out.println("방금 전");
				}
				else {
					if(date>=30) {
						System.out.println((date/30) +"개월 전");
					}
					else if(date>=1 && time>=0){
						System.out.println((date+1) + "일 전");
					}
					else if(date>=1) {
						System.out.println(date + "일 전");
					}
					else if(time>=3600 && time%3600>0) {
						System.out.println((time/3600 + 1) + "시간 전");
					}
					else if(time>=3600) {
						System.out.println(time/3600 + "시간 전");
					}
					else if(time>=60 && time%60>0) {
						System.out.println((time/60+1) + "분 전");
					}
					else if(time>=60) {
						System.out.println(time/60 + "분 전");
					}
				}
			}
		}
		
		
	}

}
