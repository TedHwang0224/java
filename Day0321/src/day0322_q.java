import java.util.Scanner;

public class day0322_q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int a = 0;
//		int b = 0;
//		while (a<=10)
//		{
//			System.out.println("1~10사이의 숫자를 입력하세요. 0을 입력하면 종료합니다.");
//			a = sc.nextInt();
//			++b;
//			if(a==0)
//			{
//				break;
//			}
//		}
//		System.out.println("입력받은 횟수는"+--b);
			
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int c = 0;
		
		do
		{
			System.out.println("1~10사이의 숫자를 입력하세요. 0을 입력하면 종료합니다.");
			num = sc.nextInt();
			if(num <=10 && num > 0)
			{
				c++;
			}
			else if(num ==0)
			{
				System.out.println(c+ "번 입력하였습니다.");
				break;
			}
			else
			{
				System.out.println("잘못된 입력입니다.");
			}
		}while(true);

	}
}
