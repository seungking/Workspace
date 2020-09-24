package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int w=5,h=2;
        System.out.println(solution(w,h));
    }

    public static long solution(int w, int h){

        long w1 = (long)w;
        long h1 = (long)h;
        long gcd = 1;
        for(long i=(w1>h1? w1:h1); i>0; i--) {
            if(w1%i==0 && h1%i==0) {
                gcd=i;
                break;
            }
        }
        return w1*h1-(w1+h1-gcd);
    }

}