import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a = sc.nextInt();
		if (a < 0)
		{
			a=-a;
			System.out.println("절대 값은" a "입니다.");
		else
			System.out.println("절대 값은" a "입니다.");
		}
		
		
		int x = 2;
		if(x % 2==0)
		{
			System.out.println("짝수");
		}
		else
		{
			System.out.println("홀수");
		}
	}

}
