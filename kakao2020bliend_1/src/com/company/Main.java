package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String new_id = "123_.def";
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(new_id));
    }

    public static String solution(String new_id) {
        String answer = "";

        //1단계
        new_id = new_id.toLowerCase();
        //2단계
        new_id = getstring(new_id);
        //3단계
        while(new_id.contains(".."))
            new_id = new_id.replace("..",".");
        //4단계
        if(new_id.startsWith(".")) new_id = new_id.substring(1,new_id.length());
        if(new_id.endsWith(".")) new_id = new_id.substring(0,new_id.length()-1);
        //5단계
        if(new_id.length()==0)new_id="a";
        //6단계
        if(new_id.length()>=16){
            new_id = new_id.substring(0,15);
            if(new_id.charAt(new_id.length()-1)=='.')
                new_id = new_id.substring(0,new_id.length()-1);
        }
        //7단계
        char temp = new_id.charAt(new_id.length()-1);
        while(new_id.length()<=2)
            new_id = new_id + temp;

        return new_id;
    }

    public static String getstring(String new_id){

        String answer = "";

        for(int i=0; i<new_id.length(); i++){
            char temp = new_id.charAt(i);
            if(((int)temp>=97&(int)temp<=122)|(temp=='-'|temp=='_'|temp=='.')|(temp-'0'>=0&temp-'0'<=9))
                answer = answer + temp;
        }

        return answer;
    }
}
