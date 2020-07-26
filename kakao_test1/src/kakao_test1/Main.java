package kakao_test1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{99,0,-99}};
        int leftx = 3;
        int lefty = 0;
        int rightx = 3;
        int righty = 2;
        
        String answer = "";
        String hand = "right";
        for(int i=0; i<number.length; i++){
    		int k=0;
    		int j=0;
    		boolean break1 = false;
    		for(k=0; k<4; k++) {
    			for (j=0; j<3; j++) {
    				if(arr[k][j]==number[i]) {
    					break1 = true;
    					break;
    				}
    			}
    			if(break1==true)break;
    		}
    		
    		int a = (leftx-k);
    		if((leftx-k)<0) a = -a;
    		int b = (lefty-j);
    		if((lefty-j)<0) b = -b;
    		int dl = a+b;
    		
    		int a1 = (rightx-k);
    		if((rightx-k)<0) a1 = -a1;
    		int b1 = (righty-j);
    		if((righty-j)<0) b1 = -b1;
    		int dr = a1+b1;
    		
        	if(number[i]==1||number[i]==4||number[i]==7) {
        		answer = answer + "L";
        		leftx = k;
        		lefty = j;
        	}
        	else if(number[i]==3||number[i]==6||number[i]==9) {
        		answer = answer + "R";
        		rightx = k;
        		righty = j;
        	}
        	else {
        		if(dl==dr) {
            		if(hand.equals("left")) {
                		answer = answer + "L";
                		leftx = k;
                		lefty = j;
            		}
            		else {
                		answer = answer + "R";
                		rightx = k;
                		righty = j;
            		}
        		}
        		else {
        			if(dl>dr) {
                		answer = answer + "R";
                		rightx = k;
                		righty = j;
        			}
        			else {
                		answer = answer + "L";
                		leftx = k;
                		lefty = j;
        			}
        		}

        	}
        }
        

	}

}
