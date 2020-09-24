package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here

        String play_time="99:59:59";
        String adv_time="25:00:00";
        String[] logs={"69:59:59-89:59:59", "01:00:00-21:00:00", "79:59:59-99:59:59", "11:00:00-31:00:00"};

        System.out.println(solution(play_time,adv_time,logs));
    }
    static int playtime;
    static int advtime;
    static int[][] logtoken;
    static int time = Integer.MIN_VALUE;
    static int result_index=-1;

    public static String solution(String play_time, String adv_time, String[] logs) {
        String answer = "";

        if(play_time.equals(adv_time)) return "00:00:00";

        playtime = getsecond(play_time);
        advtime = getsecond(adv_time);

        logtoken = new int[logs.length][2];
        for(int i=0; i< logs.length; i++){
            String[] temp =  logs[i].split("-");
            logtoken[i][0] = getsecond(temp[0]);
            logtoken[i][1] = getsecond(temp[1]);
        }

        for(int i=0; i< logs.length; i++){
            check(logtoken[i][0],i);
        }

        return logs[result_index].split("-")[0];
    }

    public static void check(int starttime, int index){

        int ptime=0;
        for(int i=0; i< logtoken.length; i++){
            if(ptime<time)return;
            if((starttime>=logtoken[i][0] && starttime<=logtoken[i][1]) | (starttime+advtime>=logtoken[i][0] && starttime+advtime<=logtoken[i][1]))
                if(starttime>logtoken[i][0]) ptime+= Math.min(starttime+advtime, logtoken[i][1]) - starttime;
                else ptime+= logtoken[i][1]-Math.min(starttime+advtime,logtoken[i][0]);
        }

        if(ptime>=time) {
            if(ptime==time){
                if(logtoken[index][0]<=logtoken[result_index][0])
                    result_index = index;
            }
            else{
                time = ptime;
                result_index = index;
            }

        }

    }

    public static int getsecond(String str){

        int sec = 0;

        String[] arr = str.split(":");

        sec+=Integer.parseInt(arr[0])*3600;
        sec+=Integer.parseInt(arr[1])*60;
        sec+=Integer.parseInt(arr[2]);

        return sec;
    }
}
