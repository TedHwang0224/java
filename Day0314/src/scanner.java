import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = sc.nextInt();
		
		System.out.println("Ű�� �Է��ϼ���");
		float height = sc.nextFloat(); // float�� ���� ����ڿ��� ����
		
		if (score >= 90) // 90~
		{
			System.out.println("��");
		}
		else if (score >= 80) // 80-89
		{
			System.out.println("��");
		}
		else if (score >= 70) // 70-79
		{
			System.out.println("��");
		}
		else if (score >= 60) // 60-69
		{
			System.out.println("��");
		}
		else // ~59
		{
			System.out.println("��");
		}
		
		if (score >= 60)
		{
			System.out.println("�հ�");
		}
		else 
		{
			System.out.println("���հ�");
		}
	}
}