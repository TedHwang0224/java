
public class FloatingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float y = 3.14f;
		
		System.out.println("y"+y);
		//printf() // 형식화된 출력
		System.out.printf("floating-point:%.8f\n", y); // 실수형, 소수점 8자리까지 // 소수점 9째자리에서 반올림
		System.out.printf("floating-point:%020.8f\n", y); // 총 20자리, 소수점 아래 8자리 포함. 나머지는 0으로 채워줌.
		System.out.printf("floating-point:%20.8f\n", y); // 총 20자리, 소수점 아래 8자리 포함.
		System.out.printf("floating-point:%.8g\n", y);
		System.out.printf("floating-point:%.8e\n", y); // 지수표현으로
		System.out.printf("%d \n", 10); //%d : 10진 정수를 출력(decimal)
		System.out.printf("%o \n", 10); //%o : 8진 정수를 출력
		System.out.printf("%x \n", 10); //%x : 16진 정수를 출력
		System.out.printf("%b \n", 10); //2진수 출력 서식문자는 없음 //%b : 논리값(boolean)
		System.out.printf("%.1f \n", 3.14); //%f : 실수 출력(float) //%.1f : 소수점 1자리까지 출력
		System.out.printf("%c \n", 'a'); // 문자 하나 출력(character)
		System.out.printf("%s \n", "abc"); // 문자 하나 출력(string)
		System.out.printf("%s, %c형 ,%d세, %.1fcm \n", "홍길동", 'B', 20, 180.5);
	}

}
