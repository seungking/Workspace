package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA", "AQWER"};
        System.out.println(solution(skill,skill_trees));
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i=0; i<skill_trees.length; i++){
            int index=skill_trees[i].indexOf(skill.charAt(0));
            int check=0;
            for(int j=1; j<skill.length(); j++){
                int nindex = skill_trees[i].indexOf(skill.charAt(j));
                if(index<0 && nindex<0){
                    continue;
                }
                else if((nindex>=0 && index>nindex) | index<0) {
                    check = -999;
                    break;
                }
                else index = nindex;
            }
            if(check == -999) continue;
            answer++;
        }

        return answer;
    }
}
