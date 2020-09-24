package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        int[] stations = {1};
        int w = 2;

        System.out.println(solution(n,stations,w));
    }

    public static int solution(int n, int[] stations, int w) {

        int answer = 0;
        int idx=0, cur=0;
        int a = 0, b=0;

        while(cur<stations.length){

            a = stations[cur]-w-1;
            b = a - idx;

            if(b>0) {
                int c = b / (w * 2 + 1);
                int d = b % (w * 2 + 1);

                answer += c;
                if (b-c*(w*2+1)>0 && d > 0) answer += 1;
            }

            idx = stations[cur]+w;
            cur++;

            if(cur==stations.length){
                b = n-idx;

                if(b>0) {
                    int c = b / (w * 2 + 1);
                    int d = b % (w * 2 + 1);

                    answer += c;
                    if (d > 0) answer += 1;
                }
            }
        }


        return answer;
    }
}
