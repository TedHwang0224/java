package example;

public class TypeMissmatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b=13;
		float c = 0;
		c = (a+b)/2f; // 25/2 = 12.5 // int 더하기 int는 int, 근데 그걸 그냥 float에에 넣어줬을 뿐, 그래서 12.0이 나옴.
		              // float로 중간에 바꾸는 과정 필요 
		              // - 대부분은 c = (float)(a+b)/2; , 위의 int타입을 float타입으로 바꿔줘도 됨, 아니면 뒤에 n.0f(내방식)도 됨.
		System.out.println(c);
		
		char c1='A';
		System.out.println(c1);
		
		char c2 = (char)(c1+1); // ++c1; // c1+1
		System.out.println(c2);		
	}

}
