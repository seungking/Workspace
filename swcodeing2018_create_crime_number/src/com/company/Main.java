package com.company;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {

        int answer = 0;

        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int num = nums[i]+nums[j]+nums[k];
                    if(check(num)) answer++;
                }
            }
        }


        return answer;
    }

    public static Boolean check(int num){

        for(int i=2; i<num; i++)
            if(num%i==0) return false;

        return true;
    }
}
