package com.company;

import java.util.*;
public class Main {

    static int answer = 0;

    public static void main(String[] args) {
        // write your code here
        int[] nums = {3,3,3,2,2,4};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums){

        int[] visited = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            HashMap<Integer,Integer> c = new HashMap<>();
            c.put(nums[i],1);
            dfs(i, nums, visited, c, 1);
        }

        return answer> nums.length/2 ? nums.length/2 : answer;
    }

    public static void dfs(int i, int[] nums, int[] visited, HashMap<Integer,Integer> c, int count){

        if(c.size() > nums.length/2 || visited[i]==1 || count> nums.length/2) return;
        if(c.size()>answer)answer++;

        visited[i]=1;

        for(int j=i+1; j< nums.length; j++){
            if(c.containsKey(nums[j])) continue;
            c.put(nums[j],0);
            dfs(j,nums,visited,c,count+1);
        }

        return;

    }
}