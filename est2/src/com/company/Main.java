package com.company;

import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.util.*;
public class Main {

    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // write your code here
        int[] scores = {1,3,7,8,10,15};
        int k=3;
        System.out.println(solution(scores, k));
    }

    public static int solution(int[] scores, int k)
    {
        int[][] check = new int[k][2];
        int[] visited = new int[scores.length];
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<k; i++) {
            check[i][0] = Integer.MAX_VALUE;
            check[i][1] = Integer.MIN_VALUE;
        }
        dfs(scores,k,check, m);

        return answer;
    }
    public static void dfs(int[] score, int k, int[][]check, HashMap<Integer, Integer> visited) {

        if (visited.size()== score.length) {

            for (int[] a : check)
                if (a[0] == Integer.MIN_VALUE | a[1] == Integer.MAX_VALUE | a[1] == Integer.MIN_VALUE | a[0] == Integer.MAX_VALUE)
                    return;

            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += check[i][1] - check[i][0];
            }

            if (sum < answer) answer = sum;
            return;
        }

        for (int i = 0; i < score.length; i++) {
            if (!visited.containsKey(score[i])) {
                for(int j=0; j<k; j++) {
                    HashMap<Integer, Integer> cm = (HashMap<Integer, Integer>)visited.clone();
                    int[][] copy = copy = check.clone();
                    if (copy[j][0] > score[i]) {
                        cm.remove(copy[j][0]);
                        cm.put(score[i], 0);
                        copy[j][0] = score[i];
                        dfs(score, k, copy, cm);
                    } else if (copy[j][1] < score[i]) {
                        cm.remove(copy[j][1]);
                        cm.put(score[i], 0);
                        copy[j][1] = score[i];
                        dfs(score, k, copy, cm);
                    }
                }
            }
        }
    }

}