
public class switchbreak_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a = 1; a <= 100; a++) // 1부터 100까지 출력하라
		{
			System.out.println(a); // a=0으로 설정했다면, println에 a+1 해주면 됨.
		}
		
		
	
		System.out.println("---------");
		
		
		
		int b = 1; // 1부터 10까지 합하라
		int sum = 0;
		for(b=1; b<=10; b++)
		{
			sum = sum + b;
		}
		System.out.println(sum);
		
		
		
		System.out.println("---------");
		
		
		
		int c = 1; // 1부터 100까지 합하라
		int sum1 = 0;
		for(c=1; c<=100; c++)
		{
			sum1 = sum1 + c;
		}
		System.out.println(sum1);
		
		
		
		System.out.println("---------");
		
		
		
		int d = 0;
		int sum2 = 0;
		for(d = 0; d <= 100; d++)
		{
			if ((d + 1) % 2 == 0)
			{
				sum2 = sum2 + (d + 1);
			}
		}
		System.out.println(sum2);

		
		
		System.out.println("---------");
		
		
		
		int e;
		int f = 0;
		for(e=0; e<100; e++)
		{
			f++;
			if(e%2==0)
			{
				continue;

			}
			System.out.print(e+"\t");
			
			if(e%5==0)
			{
				System.out.println();
			}
		}
		

	}			
}