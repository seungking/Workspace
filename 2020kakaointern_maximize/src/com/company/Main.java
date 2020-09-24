package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String expression = "100-200*300-500+20";
        System.out.println(solution(expression));
    }

    public static long solution(String expression) {
        long answer = Long.MIN_VALUE;

        String temp = "";
        ArrayList<String> a = new ArrayList<>();
        for(int i=0; i<expression.length(); i++){
            if(expression.charAt(i)!='+'&expression.charAt(i)!='*'&expression.charAt(i)!='-'){
                temp = temp + String.valueOf(expression.charAt(i));
            }
            else{
                a.add(temp);
                a.add(String.valueOf(expression.charAt(i)));
                temp = "";
            }
        }
        a.add(temp);

        char[][] p = {{'*','-','+'},{'*','+','-'},{'+','-','*'},{'+','*','-'},{'-','*','+'},{'-','+','*'}};

        for(int i=0; i<p.length; i++) {

            ArrayList<String>a1 = new ArrayList<>();
            for(String b : a)a1.add(b);

            for(int idx = 0; idx<3; idx++) {

                for (int j = 0; j < a1.size(); j++) {

                    if (a1.get(j).equals(String.valueOf(p[i][idx]))) {

                        long t = 0;
                        if (p[i][idx] == '+')
                            t = Long.parseLong(a1.get(j - 1)) + Long.parseLong(a1.get(j + 1));

                        else if (p[i][idx] == '*')
                            t = Long.parseLong(a1.get(j - 1)) * Long.parseLong(a1.get(j + 1));

                        else if (p[i][idx] == '-')
                            t = Long.parseLong(a1.get(j - 1)) - Long.parseLong(a1.get(j + 1));

                        a1.set(j - 1, String.valueOf(t));
                        a1.remove(j);
                        a1.remove(j);

                        if (a1.indexOf(String.valueOf(p[i][idx])) >= 0) idx--;
                        break;

                    }
                }
            }

            if(Math.abs(Long.parseLong(a1.get(0)))>answer)answer=Math.abs(Long.parseLong(a1.get(0)));
        }

        return answer;
    }
}
