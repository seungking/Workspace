package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static int answer;

    public static void main(String[] args) {
        String[] strs = {"ba","na","n","a"};
        String t = "banana";
        System.out.println(solution(strs,t));
    }

    public static int solution(String[] strs, String t){

        answer = 999;

        for(int i=0; i< strs.length; i++)
            if(t.startsWith(strs[i])) dfs(strs,t,"",0);

        return answer!=999 ? answer : -1;
    }

    public static void dfs(String[] strs, String t, String cur, int count){

        if(answer<count | !t.startsWith(cur)) return;
        if(cur.equals(t)){
            if(answer>count) answer = count;
            return;
        }

        for(int i=0; i< strs.length; i++)
            if(t.startsWith(cur + strs[i])) dfs(strs, t, cur + strs[i], count+1);

        return;
    }
}
