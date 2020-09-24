package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int N=8,A=4,B=7;
        System.out.println(solution(N,A,B));
    }

    public static int solution(int n, int a, int b){

        int answer=0;

//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i=0; i<n; i++){
//            if(i==a-1|i==b-1) arr.add(-1);
//            else arr.add(i);
//        }
//
//        while(arr.size()>1){
//            for(int i=0; i<arr.size(); i++){
//                if(arr.get(i)==-1 && arr.get(i+1)==-1) {
//                    answer++;
//                    return answer;
//                }
//                else{
//                    if(arr.get(i+1)==-1){
//                        arr.set(i,arr.get(i+1));
//                        arr.remove(i+1);
//                    }
//                    else {
//                        arr.set(i, arr.get(i));
//                        arr.remove(i + 1);
//                    }
//                }
//            }
//            answer++;
//        }

        while(a!=b){
            if(a%2==1) a = a/2+1;
            else a=a/2;
            if(b%2==1) b = b/2+1;
            else b=b/2;
            answer++;
        }

        return answer;
    }
}
