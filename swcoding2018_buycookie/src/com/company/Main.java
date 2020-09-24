package com.company;


import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] cookie = {1,1,2,3};
        System.out.println(solution(cookie));
    }

    public static int solution(int[] cookie){
        int answer=0;

        int len = cookie.length;
        for(int i=0; i<len; i=i+1){

            int left=0;

            for(int j=i; j>=0; j--){

                left=left+cookie[j];
                if(left<=answer)continue;

                int right=0;
                for(int k=i+1; k<len; k=k+1){

                    right=right+cookie[k];

                    if(right>left) break;
                    else if(right==left) {
                        if(right>answer)answer = right;
                        break;
                    }

                }

            }

        }

        return answer;
    }
}