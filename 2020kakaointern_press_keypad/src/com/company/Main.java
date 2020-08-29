package com.company;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

       System.out.println(solution(numbers,hand));
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";

        int[][] pad = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
        int[] curl = {3,0};
        int[] curr = {3,2};
        for(int i=0; i< numbers.length; i++){

            int l = Math.abs(curl[0]-pad[numbers[i]][0])+Math.abs(curl[1]-pad[numbers[i]][1]);
            int r = Math.abs(curr[0]-pad[numbers[i]][0])+Math.abs(curr[1]-pad[numbers[i]][1]);;

            if(numbers[i]==1 | numbers[i]==4 | numbers[i]==7){
                answer += "L";
                curl = pad[numbers[i]];
            }
            else if(numbers[i]==3 | numbers[i]==6 | numbers[i]==9){
                answer += "R";
                curr = pad[numbers[i]];
            }
            else {
                if (l == r) {
                    if (hand.equals("right")) {
                        answer += "R";
                        curr = pad[numbers[i]];
                    } else {
                        answer += "L";
                        curl = pad[numbers[i]];
                    }
                } else if (l > r) {
                    answer += "R";
                    curr = pad[numbers[i]];
                } else if (l < r) {
                    answer += "L";
                    curl = pad[numbers[i]];
                }
            }
        }

        return answer;
    }
}
