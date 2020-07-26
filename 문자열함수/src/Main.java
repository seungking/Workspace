
public class Main {

	public static void main(String[] args) {
//		startWith
//		:문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
//
//		String str = "apple"; 
//		boolean startsWith = str.startsWith("a"); 
//		System.out.println("startsWith: " + startsWith);
//		결과값 :true

		
		
//		endWith
//
//		:문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
//
//		String str = "test"; 
//		boolean endsWith = str.endsWith("t"); 
//		System.out.println("endsWith: " + endsWith);
//		결과값 :true


//		equals
//
//		: 두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
//
//		String str1 = "java"; 
//		String str2 = "java"; 
//		boolean equals = str1.equals(str2); 
//		System.out.println("equals: " + equals);
//		결과값 : true

		
		
//		equalsIgnoreCase
//
//		: 문자열과 string인스턴스의 문자열을 대소문자 구분 없이 비교한다. 
//
//		String str1 = "HELLO"; 
//		String str2 = "hello"; 
//		boolean equals = str1.equals(str2); 
//		System.out.println("equals: " + equals);

		
		
//		indexOf
//
//		: 지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
//
//		String str = "abcdef"; 
//		int indexOf = str.indexOf("d"); 
//		System.out.println("indexOf: " + indexOf);
//		결과값 : 3

		
		
//		lastindexOf
//
//		: 문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.
//
//		String str = "AdnroidApp"; 
//		int lastIndexOf = str.lastIndexOf("A"); 
//		System.out.println("lastIndexOf:" + lastIndexOf);
//		결과값 : 7 

		
		
//		length 
//
//		: 문자열의 길이를 반환한다.
//
//		String str = "abcdef"; 
//		int length = str.length(); 
//		System.out.println("length: " + length);]
//		결과값 : 6

		
		
//		replace
//
//		: 문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.
//
//		String str = "A*B*C*D";  
//		String replace = str.replace("*", "-"); 
//		System.out.println("replace: " + replace); 
//		결과값 : A-B-c-D

		
		
//		replaceAll
//
//		: 정규표현식을 지정한 문자로 바꿔서 출력한다.
//
//		String str = "AB CD"; 
//		String replaceAll = str.replaceAll("\\p{Space}", "*");  
//		System.out.println("replaceAll: " + replaceAll);
//		결과값 : AB*CD

		
		
//		split 
//
//		: 지정한 문자로 문자열을 나눌수 있다.(배열로 반환)
//
//		String str = "A:B:C:D:abcd"; 
//		String[] split = str.split(":"); 
//		System.out.println("split: " + split[1]);
//		결과값 : B

		
		
//		substring
//
//		: 문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지 않는다.)
//
//		String str = "ABCDEF"; 
//		String substring = str.substring(0, 2); 
//		System.out.println("substring: " + substring);
//		substring의 사용방법은 2가지가 있다.
//
//		substring(int startindex)은 자를 문자열릐 시작지점만 알려주면 시점부터 해당문자열의 끝까지가 나온다. 
//
//		substring(int startindex, int endindex)는 자를 문자열의 시작과 자를 문자열의 끝+1이 들어간다.
//
//		(예를들어 2,8을 넣으면 2,3,4,5,6,7에 해당하는 문자열이 나온다)
//
//		​
//
//		결과값 : AB

		
		
//		toLowerCase
//
//		:  문자열에 대문자를 소문자로 변환한다.
//
//		String str = "abcDEF"; 
//		String toLowerCase = str.toLowerCase(); 
//		System.out.println("toLowerCase: " + toLowerCase);
//		결과값 : abcdef​
		
		
		
//		toUpperCase 
//
//		: 문자열에 소문자를 대문자로 변환한다.
//
//		String str = "abcDEF"; 
//		String toUppercase = str.toUpperCase(); 
//		System.out.println("toUppercase: " + toUppercase);
//		결과값 : ABCDEF


		
//		toString
//
//		: 문자열을 그대로 반환해준다.
//
//		String str = "1234";
//		String toString = str.toString();
//		System.out.println("toString: " + toString);
//		결과값 : 1234

		
		
//		trim
//
//		: 문자열에 공백을 없에준다. 중간공백은 없애주지 않는다. 
//
//		String s = "     java java java     "; 
//		String v; v = s.trim(); 
//		System.out.println("trim:" + v);
//		결과값 : java java java

		
		
//		valueOf
//
//		: 지정한 개체의 원시 값을 반환
//
//		int i = 12345; long l = 1L; 
//		char c = '1'; 
//		System.out.println("valueOf: " + String.valueOf (i)); 
//		System.out.println("valueOf: " + String.valueOf (l)); 
//		System.out.println("valueOf: " + String.valueOf (c));
//		결과값 : 
//
//		valueOf: 12345
//
//		valueOf: 1
//
//		valueOf: 1
		
		//		compareTo
//
//		: 두개의 String를 앞에서부터 순사적으로 비교하다가 틀린부분이 있으면캐릭터값을 반환한다.(대소문자를 구별)
//
//		String str1 = "A";
//		String str2 = "B";
//		int compareTo = str1.compareTo(str2);
//
//
//		if(compareTo > 0){
//
//
//		       System.out.println(str1 + " > " +str2);
//		} else if (compareTo == 0){
//		       System.out.println(str1 + " = " +str2);
//		} else{
//		       System.out.println(str1 + " < " +str2);
//		}
//		결과값 : A<B
		
		
//		contains
//
//		: 두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.
//
//		String str1 = "abcd"; 
//		String str2 = "c"; 
//		boolean contains = str1.contains(str2); 
//		System.out.println("contains: " + contains);
//		결과값 : true

		
		
//		charAt
//
//		: 지정한 index번째에 문자를 반환한다.
//
//		String str = "charAt"; 
//		char charAt = str.charAt(2); 
//		System.out.println("charAt: " + charAt);
//		결과값 : a

		
		
//		concat
//
//		: 문자와 문자를 결합해준다.
//
//		String str1 = "Han"; 
//		String str2 = "SeeJin"; 
//		String concat = str1.concat(str2); 
//		System.out.println("concat: " + concat);
//		결과값 : HanSeeJin

		
		
//		format
//
//		: 서식문자열을 이용해서 서식화된 문자열을 반환한다.
//
//		int i = 123456789;
//		String str = String.format("%,d", i);
//		System.out.println("format: " + str);
//		결과값 : 123,456,789

		
		
//		matches
//
//		: 지정한 정규 표현과 일치 할때 true를 반환한다.
//
//		int i = 123456;
//		String str1 = String.format("%,d", i);
//		String str2 = "123456";
//		boolean matches = str1.matches(str2);
//		System.out.println("matches: " + matches);
//		결과값 : false

		
		
//		replaceFirst 
//
//		: 문자열에 지정한 문자" "가 있으면 첫번째만 새로지정한 문자" "로 바꿔서 출력한다.
//
//		String str = "Aman"; 
//		String replaceFirst = str.replaceFirst("A", "super"); 
//		System.out.println("replaceFirst: " + replaceFirst);
//		결과값 : superman
//

	}

}
