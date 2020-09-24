package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] ball = {1, 2, 3, 4, 5, 6};
        int[] order = {6, 2, 5, 1, 4, 3};

        System.out.println(solution(ball,order));
    }
    public static int[] solution(int[] ball, int[] order) {
        //정답
        int[] answer = new int[order.length];
        ArrayList<Integer> ans = new ArrayList<>();

        //보류 상태 저장 Hashmap
        HashMap<Integer,Integer> m = new HashMap<>();

        //현재상태 저장 ArrayList
        ArrayList<Integer> balls = new ArrayList<>();
        for(int a : ball) balls.add(a);

        //order 순회
        for(int i=0; i< order.length; i++){
            //맨끝 확인 후, 없으면 보류
            int prev_size= balls.size();
            if(order[i]== balls.get(0)) balls.remove(0);
            else if(order[i]== balls.get(balls.size()-1)) balls.remove(balls.size()-1);
            else m.put(order[i],1);

            //balls 상태 변화시
            if(balls.size()!=prev_size){
                //결과추가
                ans.add(order[i]);
                int run=1;
                //보류 리스트 확인
                while(run==1){
                    run=0;
                    Set<Integer> keylist = m.keySet();
                    Iterator<Integer> key = keylist.iterator();

                    //보류 키 중에서 일치하면 업데이트 후, run 변수값 조정하여 다시 반복문 실행
                    while(key.hasNext()){
                        int k = key.next();
                        if(balls.get(0)==k){
                            balls.remove(0);
                            ans.add(k);
                            m.remove(k);
                            run=1;
                            break;
                        }
                        else if(balls.get(balls.size()-1)==k){
                            balls.remove(balls.size()-1);
                            ans.add(k);
                            m.remove(k);
                            run=1;
                            break;
                        }
                    }
                }
            }

        }

        //결과 출력
        for(int i=0; i< order.length; i++) answer[i] = ans.get(i);
        return answer;
    }
}
