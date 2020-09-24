package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        String[] info = {"java backend junior - 150","python frontend senior chicken 210","python frontend senior - 150","cpp backend senior pizza 260","java backend - chicken 80","python backend senior chicken 50"};
//        String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
        String[] query = {"java and - and junior and pizza 0","python and frontend and junior and - 200","cpp and - and senior and pizza 250","- and - and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};

        System.out.println(solution(info,query));
    }

    public static int[] solution(String[] info, String[] query) {

        int n = query.length;
        int m = info.length;
        int[] answer = new int[n];

        String[][] iarr = new String[m][5];
        for(int i=0; i<m; i++) {
            iarr[i] = info[i].split(" ");
        }

        for(int i=0; i< n; i=i+1){
            query[i] = query[i].replace("and ","");
            String[] array = query[i].split(" ");
            for(int k=0; k<m; k++) {
                if (Integer.parseInt(iarr[k][4])<Integer.parseInt(array[4]))continue;
                if ((iarr[k][0].contains(array[0]) | array[0].compareTo("-")==0)&&
                        (iarr[k][1].contains(array[1]) | array[1].compareTo("-")==0)&&
                        (iarr[k][2].contains(array[2]) | array[2].compareTo("-")==0)&&
                        (iarr[k][3].contains(array[3]) | array[3].compareTo("-")==0)&&
                        (Integer.parseInt(iarr[k][4])>=Integer.parseInt(array[4])))
                    answer[i] = answer[i] + 1;
            }
        }


        return answer;
    }
}
