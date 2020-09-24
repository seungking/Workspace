package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(solution("baabaa"));
    }

    public static int solution(String s){

        if(s.length()%2==1) return 0;
///////////////////////////////////////////////////////////
//        ArrayList<Character> arr = new ArrayList<>();
//        for(int i=0; i<s.length(); i++) arr.add(s.charAt(i));
//
//        int i=0;
//        while(arr.size()-1>i){
//            if(arr.get(i)==arr.get(i+1)){
//                arr.remove(i);
//                arr.remove(i);
//                i=0;
//            }
//            else i++;
//        }
///////////////////////////////////////////////////////////////
//        int i=0;
//        while(s.length()-1>i){
//            Character a = s.charAt(i);
//            Character b = s.charAt(i+1);
//            if(a==b){
////                String temp = s.substring(i,i+2);
//                s = s.replace(a.toString()+b.toString(),"");
//                i=0;
//            }
//            else i++;
//        }
////////////////////////////////////////////////////////////////

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty() && s.charAt(i)==stack.peek()) stack.pop();
            else stack.push(s.charAt(i));
        }
        return (stack.size()>0)? 0 : 1;

    }
}
