package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        String[] orders = {"XYZ", "XWY", "WXA"};
        int[] course = {2,3,4};

        System.out.println(solution(orders,course).toString());
    }

    public static String[] solution(String[] orders, int[] course) {

        HashMap<String,Integer> m = new HashMap<>();

        for(String a : orders){

            if(m.containsKey(a)) m.put(a,m.get(a)+1);
            else m.put(a,1);

            ArrayList<String> keySetList = new ArrayList<>(m.keySet());
            for(String b : keySetList){
                if (b.equals(a)) continue;
                String[] ta = a.split("");
                String[] tb = b.split("");

                int counta = 0;
                for(int i=0; i<ta.length; i++) if(b.contains(String.valueOf(a.charAt(i)))) counta++;
                if(counta==ta.length) m.put(a,m.get(a)+1);

                int countb = 0;
                for(int i=0; i<tb.length; i++) if(a.contains(String.valueOf(b.charAt(i)))) countb++;
                if(countb==tb.length) m.put(b,m.get(b)+1);
            }

        }

        ArrayList<String> keySetList = new ArrayList<>(m.keySet());
        Collections.sort(keySetList, (o1, o2) -> (m.get(o2).compareTo(m.get(o1))));

        ArrayList<String> answer = new ArrayList<>();
        for(int i=0; i< course.length; i++){
            for(int j=0; j<keySetList.size(); j++){
                if(course[i] == keySetList.get(j).length() | m.get(keySetList.get(j))>=2) {
                    answer.add(keySetList.get(j));
                    if(m.containsValue(m.get(keySetList.get(j)))) i--;
                    keySetList.remove(j);
                    break;
                }
            }
        }
        Collections.sort(answer);
        return answer.toArray(new String[answer.size()]);

    }

}
