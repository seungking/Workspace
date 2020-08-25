package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] A = {5,1,3,7};
        int[] B = {2,2,6,8};
        System.out.println(solution(A,B));
    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int idxa=A.length-1;
        for(int i=B.length-1; i>0; i--) {
            for (int j = idxa; j >=0; j--) {
                if(B[i]>A[j]) {
                    idxa = j-1;
                    answer++;
                    A[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }

        return answer;
    }
}
