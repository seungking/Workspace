
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Double> map = new HashMap<Integer, Double>();
		
		map.put(1, 0.8);
		map.put(2, 0.3);
		map.put(3, 0.6);
		map.put(4, 0.9);
		map.put(5, 0.2);
		
		List<Integer> keySetList = new ArrayList<>(map.keySet());
		
		// ��������
		System.out.println("------value ��������------");
		Collections.sort(keySetList, (o1, o2) -> (map.get(o1).compareTo(map.get(o2))));
		
		for(Integer key : keySetList) {
			System.out.println("key : " + key + " / " + "value : " + map.get(key));
		}
		
		System.out.println();
		
		// ��������
		System.out.println("------value ��������------");
		Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		for(Integer key : keySetList) {
			System.out.println("key : " + key + " / " + "value : " + map.get(key));
	}
		
		
		Set<Integer> keyset = map.keySet(); 
		Iterator<Integer> keyiterator = keyset.iterator(); 
		Integer k; 
		Double v; 
		while(keyiterator.hasNext()) { 
			k = (Integer)keyiterator.next(); 
			v = (Double)map.get(k); 
			System.out.println("Ű : "+k+" ---> �� : "+v); 
			}
			
	}
}
