import java.util.Scanner;

public class question_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Page 21
		int a1 = 'a';
		char a2 = (char)(a1-32);
		System.out.println(a2);
		
		
		// Page 22
		int num = 5;
		String s = (num % 2)? "¦��" : "Ȧ��";
		System.out.println(s);
//		int num = 5;
//		char b;
//		if (num / 2) 
//		{
//			System.out.println("¦��");
//		}
//		else
//		{
//			System.out.println("Ȧ��");
//		}
//		System.out.println(b);
//		
//		char b = (num % 2) ? "¦��" : "Ȧ��"
		
		
		// page 37 (220317) Ǯ��
//		int num=0;
//		num++;
//		System.out.println("���� ����" + num);
//		num++;
//		System.out.println("���� ����" + num);
//		num++;
//		System.out.println("���� ����" + num);
//		num++;
//		System.out.println("���� ����" + num);
//		num++;
//		System.out.println("���� ����" + num);
//		num++;
//		System.out.println("���� ����" + num);
//		num++;
//		System.out.println("���� ����" + num); // �� / �̰� �ݺ������� ����� ver.�� �Ʒ���. (���� ���� ���̾���)
		
		int i=0;
		for (i=0; i<7;i++) // i=0 , i=1, 
		{
			num++;
			System.out.println("���� ����" + num);
		}
	}
}
