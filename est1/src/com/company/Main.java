package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
//        String[] card_numbers = {"3285-3764-9934-2453", "3285376499342453", "3285-3764-99342453", "328537649934245", "3285376499342459", "3285-3764-9934-2452"};
        String[] card_numbers = {"10101010101020", "0101010101010202"};
        System.out.println(solution(card_numbers).toString());
    }

    public static int[] solution(String[] card_numbers) {
        int[] answer = new int[card_numbers.length];

        for(int i=0; i< card_numbers.length; i++){

            if(check(card_numbers[i])==0){
                answer[i]=0;
                continue;
            }
            card_numbers[i] = card_numbers[i].replace("-","");


            int evensum=0, oddsum=0;
            for (int j = 0; j < 16; j++) {
                int temp = card_numbers[i].charAt(j) - '0';
                if (j%2==0) evensum += (temp*2>9)? (temp*2)/10+(temp*2)%10 : temp*2;
                else oddsum += temp;
            }

            if ((evensum + oddsum)%10==0) answer[i] = 1;
            else answer[i] = 0;
        }

        return answer;
    }

    public static int check(String number){

        if(number.length()==16 && number.indexOf('-')>=0)
            return 0;
        if(number.length()!=16 && number.indexOf('-')<0)
            return 0;
        if(number .length()!=16 & (number.charAt(4)!='-' | number.charAt(9)!='-' | number.charAt(14)!='-'))
            return 0;

        return 1;
    }
}