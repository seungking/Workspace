package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int cards[] = {12, 7, 11, 6, 2, 12};
        System.out.println(solution(cards));
    }
    public static int solution(int[] cards) {
        int answer = -1;

        int p=0;
        int dhide=0, d=0;
        int turn=0;
        for(int i=0; i< cards.length; i++){
            if(turn==0) p+=cards[i];
            else if(turn==1) dhide+=cards[i];
            else if(turn==2) p+=cards[i];
            else if(turn==3) d+=cards[i];
            if(turn>3){
                if(p==21)
            }

            turn++;
        }

        return answer;
    }
}
