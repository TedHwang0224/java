import java.util.Scanner;

public class ifelse_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int		a=5;
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요");
		int gender = sc.nextInt();
		
		// 만약 gender의 값이 2 또는 4라면 "여자"
		// gender가 1 또는 3인 경우 "남자"
		if (gender == 2 || gender == 4)
		{
			// "여자"를 출력해주세요
			System.out.println("여자");
		}
		else if(gender == 1 || gender == 3)
		{
			System.out.println("남자");
		}
		else 
		{
			System.out.println("해당 사항 없습니다. 제 3의 성?!");
		}
		
		
		// score가 68이다. score가 60이상이면 합격을 출력하고, 그렇지 않으면 불합격을 출력하시오.
		int score2 = 68;
		if (score2 >= 60)
		{
			System.out.println("합격");
		}
		else 
		{
			System.out.println("불합격");
		}
		
		
		int score=86;
		if (score >=90) // 90-
		{
			System.out.println("수");
		}
		else if (score >=80) // 80-89
		{
			System.out.println("우");
		}
		else if (score >=70) // 70-79
		{
			System.out.println("미");
		}
		else if (score >=60) // 60-69
		{
			System.out.println("양");
		}
		else
		{
			System.out.println("가");
		}		
		if (score2>=60)
		{
			System.out.println("합격");
		}
		else 
		{
			System.out.println("불합격");
		}
	}

}
