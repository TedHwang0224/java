
public class practice0315 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60, b=70, c=80, d=50, e=30;
		int sum=0;
		
		sum = a+b+c+d+e;
		
//		sum = sum + a;
//		sum = sum + b;
//		sum = sum + c;
//		sum = sum + d;
//		sum = sum + e;
		
		float avg = sum/5.0f; // int/float -> float
		
		// 출력
		System.out.printf("나잘난의 성적 총 합계는 %d 입니다. 평균은 %.1f 입니다.", sum,avg);
	}

}
