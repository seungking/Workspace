package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] boxes ={{1, 2}, {2, 1}, {3, 3}, {4, 5}, {5, 6}, {7, 8}};
        System.out.println(solution(boxes));
    }
    public static int solution(int[][] boxes) {
        int answer = 0;

        //포장 성공한 박스 체크
        int[] complete = new int[boxes.length];

        //포장 할 수 있는 박스 체크
        for(int i=0; i< boxes.length; i++) if(boxes[i][0]==boxes[i][1]) complete[i]=1;

        //박스 순회
        for(int i=0; i< boxes.length; i++){
            for(int j=0; j< boxes.length; j++) {
                int temp=0;
                //같다면 위치 바꿔주고 complete 변수 업데이트
                if(complete[j]!=1 && i!=j){
                    if(boxes[i][0]==boxes[j][0]){
                        temp = boxes[j][0];
                        boxes[j][0]=boxes[i][1];
                        boxes[i][1]=temp;
                    }
                    else if(boxes[i][0]==boxes[j][1]){
                        temp = boxes[j][1];
                        boxes[j][1]=boxes[i][1];
                        boxes[i][1]=temp;
                    }
                    else if(boxes[i][1]==boxes[j][0]){
                        temp = boxes[j][0];
                        boxes[j][0]=boxes[i][0];
                        boxes[i][0]=temp;
                    }
                    else if(boxes[i][1]==boxes[j][1]){
                        temp = boxes[j][1];
                        boxes[j][1]=boxes[i][0];
                        boxes[i][0]=temp;
                    }
                    if(temp!=0) {
                        if (boxes[i][0] == boxes[i][1]) complete[i] = 1;
                        if (boxes[j][0] == boxes[j][1]) complete[j] = 1;
                        break;
                    }
                }
            }
        }

        //전체 박스 크기에서 complete에 확인된값의 차를 출력
        for(int a : complete) if(a==1) answer++;
        return boxes.length - answer;
    }
}
