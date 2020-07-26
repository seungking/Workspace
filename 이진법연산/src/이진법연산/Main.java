package 이진법연산;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,20};
		
		for(int i=0; i<arr1.length; i++) {
			int arr = arr1[i] | arr2[i];
			System.out.println(Integer.toBinaryString(arr));
		}
		
		System.out.println();
		for(int i=0; i<arr1.length; i++) {
			int arr = arr1[i] & arr2[i];
			System.out.println(Integer.toBinaryString(arr));
		}
	}

}
