package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code her
        String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        System.out.println(solution(gems));
    }
    public static int[] solution(String[] gems) {
        int[] answer = {0, Integer.MAX_VALUE};

        HashMap<String,Integer> m = new HashMap<>();
        for(String a : gems)m.put(a,0);
        int len = m.size();

        int start=0, end=0;
        HashMap<String,Integer> s = new HashMap<>();
        for(; end< gems.length; end++){
            s.put(gems[end],end);
            if(s.size()==len) break;
        }

        HashMap<String,Integer> s2 = new HashMap<>();
        for(start = end; start>=0; start--){
            s2.put(gems[start],start);
            if(s2.size()==len) break;
        }

        HashMap<String,Integer> a = new HashMap<>();
        for(int i=start; i< end+1; i=i+1) {

            a.clear();
            a.put(gems[i],0);

            if(a.size()==len){
                answer[0] = i+1;
                answer[1] = i+1;
                return answer;
            }

            for (int j = i+1; j < end+1; j=j+1) {
                if((answer[1]-answer[0])<=j-i) break;
                a.put(gems[j],0);
                if(a.size()==len){
                    if((answer[1] - answer[0])>j-i) {
                        answer[0] = i+1;
                        answer[1] = j+1;
                        break;
                    }
                    break;
                }
            }
        }

//        int start=0, end=0;
//        HashMap<String,Integer> s = new HashMap<>();
//        for(; end< gems.length; end++){
//            s.put(gems[end],end);
//            if(s.size()==len) break;
//        }
//
//        HashMap<String,Integer> s2 = new HashMap<>();
//        for(start = end; start>=0; start--){
//            s2.put(gems[start],start);
//            if(s2.size()==len) break;
//        }
//
//        answer[0] = start+1;
//        answer[1] = end+1;

        return answer;
    }
}
