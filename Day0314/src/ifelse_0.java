import java.util.Scanner;

public class ifelse_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int		a=5;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int gender = sc.nextInt();
		
		// ���� gender�� ���� 2 �Ǵ� 4��� "����"
		// gender�� 1 �Ǵ� 3�� ��� "����"
		if (gender == 2 || gender == 4)
		{
			// "����"�� ������ּ���
			System.out.println("����");
		}
		else if(gender == 1 || gender == 3)
		{
			System.out.println("����");
		}
		else 
		{
			System.out.println("�ش� ���� �����ϴ�. �� 3�� ��?!");
		}
		
		
		// score�� 68�̴�. score�� 60�̻��̸� �հ��� ����ϰ�, �׷��� ������ ���հ��� ����Ͻÿ�.
		int score2 = 68;
		if (score2 >= 60)
		{
			System.out.println("�հ�");
		}
		else 
		{
			System.out.println("���հ�");
		}
		
		
		int score=86;
		if (score >=90) // 90-
		{
			System.out.println("��");
		}
		else if (score >=80) // 80-89
		{
			System.out.println("��");
		}
		else if (score >=70) // 70-79
		{
			System.out.println("��");
		}
		else if (score >=60) // 60-69
		{
			System.out.println("��");
		}
		else
		{
			System.out.println("��");
		}		
		if (score2>=60)
		{
			System.out.println("�հ�");
		}
		else 
		{
			System.out.println("���հ�");
		}
	}

}