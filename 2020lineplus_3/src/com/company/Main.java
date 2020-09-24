package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int n=100;
        System.out.println(solution(n).toString());
    }

    static int[] answer = new int[2];

    public static int[] solution(int n) {

        int n1, n2;
        String front1, back1, front2, back2;

        //n이 10이상의 범위에서 진행
        while((n/10)>0) {
            //String으로 변환
            String num = String.valueOf(n);

            //최단 시간에 계산하기 위하여 절반으로 나누기 위한 변수
            int split = num.length()/2;
            //나눌 부분의 숫자가 0이라면 뒤로 이동
            while(split!=num.length() && num.charAt(split)=='0') split++;

            //숫자뒤에 전부 0일 경우 예외처리
            if(split==num.length()){
                split = num.length()/2;
                while(num.charAt(split)=='0') split--;
                n = Integer.parseInt(num.substring(0,split+1));
                answer[0]++;
                continue;
            }

            //split 나눔
            front1 = num.substring(0,split);
            back1 = num.substring(split,num.length());
            n1 = Integer.parseInt(front1) + Integer.parseInt(back1);

            //split+1 부분에서 나눔
            front2 = num.substring(0, split + 1);
            back2 = num.substring(split + 1, num.length());
            if(front2.length()==0 | back2.length()==0) n2 = Integer.MAX_VALUE;
            else n2 = Integer.parseInt(front2) + Integer.parseInt(back2);

            //작은것으로 적용
            n = (n1 >= n2) ? n2 : n1;

            answer[0]++;
        }

        answer[1] = n;
        return answer;
    }
}
