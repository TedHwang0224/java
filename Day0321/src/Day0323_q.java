
public class Day0323_q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Page 15
		for(int a = 0; a < 10; a++)
		{
			System.out.println(a);
		}
		
		
		
		System.out.println("--------------------");
		
		
		
		// Page 16
		for(int b = 0; b <= 5; b++)
		{
			System.out.println("sum = sum + a["+b+"]");
		}
//		문제 풀이
//		int sum=0;
//		for(int i = 0; i<6; i++)
//		{
//			sum=sum+k[i];
//		}
//		System.out.println(k);
		
		
		
		
		
		System.out.println("--------------------");
		
		
		
		// Page 17
//		for(int c = 10; c <= 10000; c*10)
//		// for(var i = 0; i < length; i+=10)
//		{
//			System.out.println("num["+c+"] = "+10+=10);
//		}

		
//		for(int d = 0; d <= 5; d++)
//		{
//			System.out.println("numb["+d+"] = 1");
//		}
		
		
		// page 20 풀이
		// 1 2 3 4 5 ... 100
		// 1 3 6
		int i=0;
		int sum =0;
		for(i=1; i<=100; i++)
//		i++; // 1
//		sum = sum + i; // 0+1 sum=1
//		i++; // 2
//		sum = sum + i; // 1+2 sum = 3 , i = 2
//		i++; // 3
//		sum = sum + i; // 3+3 = 6
		{
			sum = sum + i;
			System.out.println(sum);
		}
		
		System.out.println("--------------------");
		
		
//		int[] c = {2, 10, 8, 5, 3, 9};
//		{
//			
//		}
		
		
		// page 17 풀이
		// num[1]=10; , num[2]=100; , num[3]=1000; , num[4]=10000;
		int [] num = new int[5];
		int e = 1;
		for(int d = 1; d<5; d++)
		{
			e=e*10; // e=10  // 10*10=100 e=100,  //  e=100*10=1000  // e=10000
			num[d]=e; // num[1]=10  //  num[2]=100
		}
		//print
		
		
		
		// Page 13 풀이
		// int 10개, 1, 10, 100, 1000
		int [] num2 = new int[10];
		int e2 = 1;
		int sum2 = 0;
		for(int d2 = 0; d2<10; d2++)
		{
			num2[d2]=e2;
			sum2=sum2+num2[d2];
			e2=e2*10;
		}
		
		if (num2[0]>num2[1])
		{
			// num2[0]가 큰 경우
			System.out.println(0);
		}
		else if (num2[0] == num2[1])
		{
			System.out.println("같은 경우");
		}
		else
		{
			// num2[1]가 큰 경우
			System.out.println(1);
		}
		
		// 1, 10 , 100, 1000, 10000
		int idx = 0;
		// int max = num2[0];  // 배열의 첫번째 값을 max로 할당
		int max = -1;
		for(int i2=0; i2<10; i2++)  // i=1
		{
			if(num2[i2] > max)  // num2[1] > max  10>1
			{
				max = num2[i2]; // 1 > -1 만족하면 max의 값에 1을 넣어쥼. 둘을 비교하여 더 큰 수를 가져가는 max변수
								// max = num2[1];  // max = 10;
				idx=i2;  // max를 갱신하면 첨자를 백업해두자.  // idx = 1;
			}
			else
			{
				// max의 값이 최대값이 맞아서 max의 값을 갱신하지 않음.
				// -1 > -2  
			}
		}
		
		
		// int[]num3 = new int[2];
		int a = 10;
		int b = 15;
		int max2 = -1;
		
		if (a > max2)
		{
			max2 = a; // 10
		}
		else
		{
			max2 = b; // 15 > 10
		}
		max = 15
	}

}
