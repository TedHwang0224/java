import java.util.Scanner;

public class day0322_q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int a = 0;
//		int b = 0;
//		while (a<=10)
//		{
//			System.out.println("1~10������ ���ڸ� �Է��ϼ���. 0�� �Է��ϸ� �����մϴ�.");
//			a = sc.nextInt();
//			++b;
//			if(a==0)
//			{
//				break;
//			}
//		}
//		System.out.println("�Է¹��� Ƚ����"+--b);
			
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int c = 0;
		
		do
		{
			System.out.println("1~10������ ���ڸ� �Է��ϼ���. 0�� �Է��ϸ� �����մϴ�.");
			num = sc.nextInt();
			if(num <=10 && num > 0)
			{
				c++;
			}
			else if(num ==0)
			{
				System.out.println(c+ "�� �Է��Ͽ����ϴ�.");
				break;
			}
			else
			{
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}while(true);

	}
}
