package example;

public class TypeMissmatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b=13;
		float c = 0;
		c = (a+b)/2f; // 25/2 = 12.5 // int ���ϱ� int�� int, �ٵ� �װ� �׳� float���� �־����� ��, �׷��� 12.0�� ����.
		              // float�� �߰��� �ٲٴ� ���� �ʿ� 
		              // - ��κ��� c = (float)(a+b)/2; , ���� intŸ���� floatŸ������ �ٲ��൵ ��, �ƴϸ� �ڿ� n.0f(�����)�� ��.
		System.out.println(c);
		
		char c1='A';
		System.out.println(c1);
		
		char c2 = (char)(c1+1); // ++c1; // c1+1
		System.out.println(c2);		
	}

}
