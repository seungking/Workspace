package com.company;


public class Main {

    static int answer=0;

    public static void main(String[] args) {
        // write your code here
        String[] arr = {"1", "-", "3", "+", "5", "-", "8"};
        System.out.println(solution(arr));
    }

    public static int solution(String[] arr){

        cal(2, arr, arr[1], Integer.parseInt(arr[0]));

        return answer;
    }

    public static void cal(int i, String[] arr, String sign, int cur){

        if(i==arr.length/2+1){
            if(cur>answer) answer=cur;
        }

        if(sign.contains("+")){

        }
        else{

        }


    }
}