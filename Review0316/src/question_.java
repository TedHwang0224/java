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
		String s = (num % 2)? "짝수" : "홀수";
		System.out.println(s);
//		int num = 5;
//		char b;
//		if (num / 2) 
//		{
//			System.out.println("짝수");
//		}
//		else
//		{
//			System.out.println("홀수");
//		}
//		System.out.println(b);
//		
//		char b = (num % 2) ? "짝수" : "홀수"
		
		
		// page 37 (220317) 풀이
//		int num=0;
//		num++;
//		System.out.println("알의 개수" + num);
//		num++;
//		System.out.println("알의 개수" + num);
//		num++;
//		System.out.println("알의 개수" + num);
//		num++;
//		System.out.println("알의 개수" + num);
//		num++;
//		System.out.println("알의 개수" + num);
//		num++;
//		System.out.println("알의 개수" + num);
//		num++;
//		System.out.println("알의 개수" + num); // 일 / 이걸 반복문으로 축약한 ver.이 아래식. (아직 배우기 전이었음)
		
		int i=0;
		for (i=0; i<7;i++) // i=0 , i=1, 
		{
			num++;
			System.out.println("알의 개수" + num);
		}
	}
}
