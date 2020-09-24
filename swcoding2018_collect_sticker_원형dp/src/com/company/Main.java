package com.company;

public class Main {

    public static void main(String[] args) {

        int[] sticker = {14, 6, 5, 11, 3, 9, 2, 10};
        System.out.println(solution(sticker));
    }
    public static int solution(int sticker[]) {
        int answer = 0;

        if(sticker.length==1) return sticker[0];

        int[] result1 = new int[sticker.length];
        result1[0] = sticker[0];
        result1[1] = sticker[0];

        for(int i=2; i< sticker.length-1; i++){
            result1[i] = Math.max(result1[i-2] + sticker[i],result1[i-1]);
        }

        int[] result2 = new int[sticker.length];
        result2[0] = 0;
        result2[1] = sticker[1];

        for(int i=2; i< sticker.length; i++){
            result2[i] = Math.max(result2[i-2] + sticker[i],result2[i-1]);
        }

        return Math.max(result1[sticker.length-2],result2[sticker.length-1]);
    }
}
