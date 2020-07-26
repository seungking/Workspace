import java.util.*;

public class Main {

	public static ArrayList<Integer> results = new ArrayList<Integer>();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>();
		
		
		for(int j=0; j<n; j++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int i=0; i<n; i++) {
				int a = sc.nextInt();
				temp.add(a);				
			}
			board.add(temp);
		}
		
		run(board, n, 0, 1);
		run(board, n, 0, 2);
		run(board, n, 0, 3);
		run(board, n, 0, 4);
		final ArrayList<Integer> resultss = results;
		Collections.sort(results);
		Collections.reverse(results);
		System.out.println(resultss.get(0));
	}
	
	public static void run(ArrayList<ArrayList<Integer>> board, int n, int count, int d) {
		
		if(count>=5) {
			int max = -1;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(board.get(i).get(j)>max) max = board.get(i).get(j);
				}
			}
			results.add(max);
			return;
		}
		
		ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
		for(int j=0; j<n; j++) {
			ArrayList<Integer> tempa = new ArrayList<Integer>();
			for(int i=0; i<n; i++) {
				tempa.add(board.get(j).get(i));				
			}
			temp.add(tempa);
		}
		
		if(d==1) {//왼쪽
			for(int i=0; i<n; i++) {
				int index=0;
				for(int k=0; k<n; k++) {
					if(temp.get(i).get(index)==0) {
						temp.get(i).remove(index);
						temp.get(i).add(0);
						index--;
					}
					index++;
				}
				for(int j=0; j<n-1; j++) {
					if(temp.get(i).get(j).equals(temp.get(i).get(j+1))) {
						temp.get(i).set(j, temp.get(i).get(j)*2);
						temp.get(i).set(j+1, 0);
						break;
					}	
				}
				for(int k=0; k<n; k++) {
					if(temp.get(i).get(k)==0) {
						temp.get(i).remove(k);
						temp.get(i).add(0);
					}
				}
			}
		}
		else if(d==2) {//오른쪽
			for(int i=0; i<n; i++) {
				int index=n-1;
				for(int k=0; k<n; k++) {
					if(temp.get(i).get(k)==0) {
						temp.get(i).remove(k);
						temp.get(i).add(0,0);
					}
				}
				for(int j=n-1; j>0; j--) {
					if(temp.get(i).get(j).equals(temp.get(i).get(j-1))) {
						temp.get(i).set(j, temp.get(i).get(j)*2);
						temp.get(i).set(j-1, 0);
						break;
					}	
				}
				for(int k=0; k<n; k++) {
					if(temp.get(i).get(k)==0) {
						temp.get(i).remove(k);
						temp.get(i).add(0,0);
					}
				}
			}
		}
		else if(d==3) {//위쪽
			for(int i=0; i<n; i++) {
				ArrayList<Integer> box = new ArrayList<Integer>();
				for(int k=0; k<n; k++) {
					box.add(temp.get(k).get(i));
				}
				int index=0;
				for(int k=0; k<n; k++) {
					if(box.get(index)==0) {
						box.remove(index);
						box.add(0);
						index--;
					}
					index++;
				}
//				Collections.reverse(box);
				for(int k=0; k<n; k++) {
					temp.get(k).set(i,box.get(k));
				}
				for(int j=0; j<n-1; j++) {
					if(temp.get(j).get(i).equals(temp.get(j+1).get(i))) {
						temp.get(j).set(i, temp.get(j).get(i)*2);
						temp.get(j+1).set(i, 0);
						break;
					}	
				}
				for(int k=0; k<n-1; k++) {
					if(temp.get(k).get(i)==0) {
						temp.get(k).set(i,temp.get(k+1).get(i));
						temp.get(k+1).set(i,0);
					}
				}
			}
		}
		else if(d==4) {//아래쪽
			for(int i=0; i<n; i++) {
				ArrayList<Integer> box = new ArrayList<Integer>();
				for(int k=0; k<n; k++) {
					box.add(temp.get(k).get(i));
				}
				int index=0;
				for(int k=0; k<n; k++) {
					if(box.get(index)==0) {
						box.remove(index);
						box.add(0);
						index--;
					}
					index++;
				}
				Collections.reverse(box);
				for(int k=0; k<n; k++) {
					temp.get(k).set(i,box.get(k));
				}
				for(int j=n-1; j>0; j--) {
					if(temp.get(j).get(i).equals(temp.get(j-1).get(i))) {
						temp.get(j).set(i, temp.get(j).get(i)*2);
						temp.get(j-1).set(i, 0);
						break;
					}	
				}
				for(int k=n-1; k>0; k--) {
					if(temp.get(k).get(i)==0) {
						temp.get(k).set(i,temp.get(k-1).get(i));
						temp.get(k-1).set(i,0);
					}
				}
			}
		}
		
		run(temp, n, count+1, 1);
		run(temp, n, count+1, 2);
		run(temp, n, count+1, 3);
		run(temp, n, count+1, 4);

		
	
	}


}