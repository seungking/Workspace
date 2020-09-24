package com.company;

import javax.sound.sampled.Line;
import java.util.*;
public class Main {

    public static void main(String[] args) {
//        int[] priorities = {2, 1, 3, 2};
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location=0;

        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location){

        int answer=0;
        ArrayList<Integer> qu = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : priorities) {
            qu.add(i);
            arr.add(i);
        }
        Collections.sort(qu);
        Collections.reverse(qu);

        int i=0;
        while(qu.size()>0){
            if(qu.get(0)==arr.get(i%arr.size())){
                answer++;
                arr.set(i%arr.size(),-1);
                qu.remove(0);
                if(i%arr.size()==location) break;
            }
            i++;
        }

        return answer;
    }
}
