package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] d = {1, 3, 2, 5, 4};
//        int[] d = {2,2,3,3};
        int budget = 9;

        System.out.println(solution(d, budget));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        int cur = 0;
        int count=0;
//        for (int i = 0; i < d.length; i++){
//            cur+=d[i];
//            if(cur>budget) continue;
//            count++;
//            for (int j = i+1; j < d.length; j++){
//                int cur1 = cur + d[j];
//                int count1 = count + 1;
//                for (int k = j+1; k < d.length; k++) {
//                    cur1+=d[k];
//                    count1++;
//                    if(cur1>budget)
//                        break;
//                    if(cur1<=budget && count1>answer)
//                        answer = count1;
//                }
//                cur1=0;
//                count1=0;
//            }
//            cur=0;
//            count=0;
//        }

        for(int i=0; i<d.length; i++){
            budget -= d[i];
            if(budget<0) break;
            count++;
        }

        return count;
    }
}
