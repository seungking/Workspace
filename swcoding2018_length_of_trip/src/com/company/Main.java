package com.company;


import java.awt.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        String dirs = "UUUUDUDUDUUU";
        System.out.println(solution(dirs));
    }

    public static int solution(String dirs){

        int[][]arr = new int[11][11];
        int[][][]check = new int[11][11][4];
        int answer=0;

        Point c = new Point(5,5);

        for(int i=0; i<dirs.length(); i++){
            if(dirs.charAt(i)=='U'){
                if (c.y>=10)continue;
                if (check[c.x][c.y][0]==1) {
                    c.y+=1;
                    continue;
                }
                check[c.x][c.y][0]=1;
                c.y+=1;
                answer++;
                check[c.x][c.y][1]=1;
            }
            else if(dirs.charAt(i)=='D'){
                if(c.y<=0) continue;
                if (check[c.x][c.y][1]==1) {
                    c.y-=1;
                    continue;
                }
                check[c.x][c.y][1]=1;
                c.y-=1;
                answer++;
                check[c.x][c.y][0]=1;
            }
            else if(dirs.charAt(i)=='R'){
                if(c.x>=10) continue;
                if (check[c.x][c.y][2]==1) {
                    c.x+=1;
                    continue;
                }
                check[c.x][c.y][2]=1;
                c.x+=1;
                answer++;
                check[c.x][c.y][3]=1;
            }
            else if(dirs.charAt(i)=='L'){
                if(c.x<=0) continue;
                if (check[c.x][c.y][3]==1) {
                    c.x-=1;
                    continue;
                }
                check[c.x][c.y][3]=1;
                c.x-=1;
                answer++;
                check[c.x][c.y][2]=1;
            }
        }

        return answer;
    }
}