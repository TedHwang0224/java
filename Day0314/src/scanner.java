import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		
		System.out.println("키를 입력하세요");
		float height = sc.nextFloat(); // float의 값을 사용자에게 받음
		
		if (score >= 90) // 90~
		{
			System.out.println("수");
		}
		else if (score >= 80) // 80-89
		{
			System.out.println("우");
		}
		else if (score >= 70) // 70-79
		{
			System.out.println("미");
		}
		else if (score >= 60) // 60-69
		{
			System.out.println("양");
		}
		else // ~59
		{
			System.out.println("가");
		}
		
		if (score >= 60)
		{
			System.out.println("합격");
		}
		else 
		{
			System.out.println("불합격");
		}
	}
}
