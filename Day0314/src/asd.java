import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int a = sc.nextInt();
		if (a < 0)
		{
			a=-a;
			System.out.println("���� ����" a "�Դϴ�.");
		else
			System.out.println("���� ����" a "�Դϴ�.");
		}
		
		
		int x = 2;
		if(x % 2==0)
		{
			System.out.println("¦��");
		}
		else
		{
			System.out.println("Ȧ��");
		}
	}

}