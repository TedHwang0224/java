
public class Day0311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a'; // �ƽ�Ű�ڵ�ǥ���� a�� 97
		// char c2 = c1+1;
		char c3 = (char) (c1+1); // c1�� 97 + 1�� 98, 98�� �ƽ�Ű�ڵ�ǥ���� b 
		System.out.println(c3);
		char c4 = ++c1; // ++�� 1�� ���Ѵ�(?)�� �Ű�, c1�� 97. // 1�� 97�� ���ϸ� 98, �ƽ�Ű�ڵ�ǥ���� 98�� b 
		System.out.println(c4);
		int i = 'B'-'A'; // �ƽ�Ű�ڵ�ǥ���� B�� 66 & A�� 65. // B-A = 66-65, ���� 1
		System.out.println(i);
		int j = '2'-'0'; // 2���� 0�� -�ϸ�, ���� 2
		System.out.println(j);
		
		int k = 7;
		System.out.println(k > 3 && k < 5);
		System.out.println(k > 3 || k < 0);
		
		char x = 'j';
		System.out.println(x>='a' && x<='z');
		System.out.println((x>='a' && x<='z') || (x>='A' && x<='Z'));
	}
}