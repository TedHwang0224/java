
public class Day0311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a'; // 아스키코드표에서 a는 97
		// char c2 = c1+1;
		char c3 = (char) (c1+1); // c1은 97 + 1은 98, 98은 아스키코드표에서 b 
		System.out.println(c3);
		char c4 = ++c1; // ++은 1을 더한다(?)는 거고, c1은 97. // 1과 97을 더하면 98, 아스키코드표에서 98은 b 
		System.out.println(c4);
		int i = 'B'-'A'; // 아스키코드표에서 B는 66 & A는 65. // B-A = 66-65, 따라서 1
		System.out.println(i);
		int j = '2'-'0'; // 2에서 0을 -하면, 값은 2
		System.out.println(j);
		
		int k = 7;
		System.out.println(k > 3 && k < 5);
		System.out.println(k > 3 || k < 0);
		
		char x = 'j';
		System.out.println(x>='a' && x<='z');
		System.out.println((x>='a' && x<='z') || (x>='A' && x<='Z'));
	}
}
