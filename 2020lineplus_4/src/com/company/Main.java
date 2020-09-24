package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[][] maze = {{0, 1, 0, 1}, {0, 1, 0, 0}, {0, 0, 0, 0}, {1, 0, 1, 0}};
        System.out.println(solution(maze));
    }

    public static int solution(int[][] maze) {

        //정답, x y 좌표
        int answer = 0, x = 0, y = 0;

        //방향 변수 l = 왼, r = 오른, u = 위, d = 아래
        char d = (maze[0][1]==1)? 'd' : 'r';

        //탈출 까지 반복
        while(x!= maze.length-1 && y!= maze.length-1){

            //이동
            answer++;

            //현재 방향에 따른 값 설정
            //왼쪽 방향
            if(d=='l'){
                //오른쪽으로 갈 경우
                if((y==0 | ((y>0) && (maze[x][y-1]==1)))&&
                        ((x+1>=maze.length) | (x< maze.length-1) && maze[x+1][y]==1)&&
                        (x==0 | (x>0 && maze[x-1][y]==1)))
                    d='r';
                    //위로 갈 경우
                else if((y==0 | ((y>0) && (maze[x][y-1]==1)))&&
                        ((x+1>=maze.length) | (x< maze.length-1) && maze[x+1][y]==1)||
                        ((x>0 && maze[x-1][y+1]==1)))
                    d='u';
                    //아래로 갈 경우
                else if((y==0 | ((y>0) && (maze[x][y-1]==1)))&&
                        (x==0 | (x>0 && maze[x-1][y]==1))||
                        ((x< maze.length-1 && maze[x+1][y+1]==1)))
                    d='d';
            }
            //오른쪽 방향
            else if(d=='r'){
                //왼쪽으로 갈 경우
                if(((y+1 >= maze.length) | ((y< maze.length-1) && maze[x][y+1]==1))&&
                        ((x+1>=maze.length) | (x< maze.length-1) && maze[x+1][y]==1)&&
                        (x==0 | (x>0 && maze[x-1][y]==1)))
                    d='l';
                //위로 갈 경우
                if(((y+1 >= maze.length) | ((y< maze.length-1) && maze[x][y+1]==1))&&
                        ((x+1>=maze.length) | (x< maze.length-1) && maze[x+1][y]==1)||
                        ((x>0 && maze[x-1][y-1]==1)))
                    d='u';
                //아래로 갈 경우
                if(((y+1 >= maze.length) | ((y< maze.length-1) && maze[x][y+1]==1))&&
                        (x==0 | (x>0 && maze[x-1][y]==1))||
                        ((x< maze.length-1 && maze[x+1][y-1]==1)))
                    d='d';
            }
            //위 방향
            else if(d=='u'){
                //아래로 갈 경우
                if((x==0 | (x>0 && maze[x-1][y]==1))&&
                        ((y+1 >= maze.length) | ((y< maze.length-1) && maze[x][y+1]==1))&&
                        (y==0 | ((y>0) && (maze[x][y-1]==1))))
                    d='d';
                //왼쪽으로 갈 경우
                if((x==0 | (x>0 && maze[x-1][y]==1))&&
                        ((y+1 >= maze.length) | ((y< maze.length-1) && maze[x][y+1]==1))||
                        ((y>0 && maze[x-1][y-1]==1)))
                    d='l';
                //오른쪽으로 갈 경우
                if((x==0 | (x>0 && maze[x-1][y]==1))&&
                        (y==0 | ((y>0) && (maze[x][y-1]==1)))||
                        ((y< maze.length-1 && maze[x-1][y+1]==1)))
                    d='r';
            }
            //아래 방향
            else if(d=='d'){
                //위로 갈 경우
                if(((x+1>=maze.length) | (x< maze.length-1) && maze[x+1][y]==1)&&
                        ((y+1 >= maze.length) | ((y< maze.length-1) && maze[x][y+1]==1))&&
                        (y==0 | ((y>0) && (maze[x][y-1]==1))))
                    d='u';
                    //왼쪽으로 갈 경우
                else if(((x+1>=maze.length) | (x< maze.length-1) && maze[x+1][y]==1)&&
                        ((y+1 >= maze.length) | ((y< maze.length-1) && maze[x][y+1]==1))||
                        ((y>0 && maze[x-1][y-1]==1)))
                    d='l';
                    //오른쪽으로 갈 경우
                else if(((x+1>=maze.length) | (x< maze.length-1) && maze[x+1][y]==1)&&
                        (y==0 | ((y>0) && (maze[x][y-1]==1)))||
                        ((x>0 && y< maze.length-1 && maze[x-1][y+1]==1))&&(maze[x][y+1]!=1))
                    d='r';
            }

            if(d=='l')y--;
            else if(d=='r')y++;
            else if(d=='u')x--;
            else if(d=='d')x++;

        }


        return answer;
    }

}
