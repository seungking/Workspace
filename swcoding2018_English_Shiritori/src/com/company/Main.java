package com.company;

import java.util.HashMap;

public class Main {
    static int [] answer = new int[2];
    public static void main(String[] args) {

        int n  = 2;
//        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] words = {"land","dream","mom","mom","ror"};
        solution(n,words);

        for (int a : answer) {
            System.out.println(a);
        }

    }

    public static int[] solution(int n, String[] words) {


        HashMap<String,Integer> h = new HashMap<>();

        int i=1;
        h.put(words[0],0);
        char a = words[0].charAt(words[0].length()-1);
        for(; i< words.length; i++){
            if(words[i].charAt(0)==a & !h.containsKey(words[i])) {
                a = words[i].charAt(words[i].length()-1);
                h.put(words[i],0);
            }
            else break;
        }

        if(i == words.length){
            answer[0] = 0;
            answer[1] = 0;
        }
        else{
            answer[0] = i%(n) + 1;
            answer[1] = (i+n)/n;
        }

        return answer;
    }
}
