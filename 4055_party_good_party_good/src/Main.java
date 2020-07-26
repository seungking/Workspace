import java.util.*;

class Times{
	public double s,e;
	public Times(int s, int e) {this.s=s; this.e=e;}
}

public class Main {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> results = new ArrayList<Integer>();
		
		while(true) {
			int a = -1;
			a = sc.nextInt();
			ArrayList<Times> times = new ArrayList<Times>();
			
			if(a==0)break;
			else {
				int parties_num = a;
				for(int i=0; i<a; i++) {
					int s = sc.nextInt();
					int e = sc.nextInt();
					times.add(new Times(s,e));
				}
			}
		
			int count=0;
			double ctime = 8;
			while(ctime<24) {
				int index=99;
				double min=99;
				for(int i=0; i<times.size(); i++) {
					if(times.get(i).s<=ctime&&ctime+0.5<=times.get(i).e) {
						if(min>times.get(i).e) {
							min = times.get(i).e;
							index = i;
						}
					}
				}
				if(index!=99) {
					count++;
					times.remove(index);
				}
				ctime = ctime + 0.5;
			}
			
			results.add(count);
		}
		
		for(int i=0; i<results.size(); i++) {
			System.out.println("On day " + (i+1) + " Emma can attend as many as " + results.get(i) + " parties.");
		}
	}
}

