
public class forwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		for (int i=0; i<5; i++)
		{
			System.out.println(++a);
		}
		
		
		for (int i=5; i>0; i--)
		{
			System.out.println('i');
		}
		
		
//		for (int i=0; i<2; i++)
//		{
//			System.out.println("예"+i);
//			for(int j = 0; j<3; j++)
//			{
//				System.out.println("아니오"+j); // 2 X 3 = 아니오 6번 출현 & 예 도 같이 2번 나와서 총 8번 출력되었음. 
//			}
//		}
		
		
		for (int i=5; i>=1; i--)
		{
			System.out.println(i+'\t');
		}
		
		
		
		System.out.println("Hello World");
		
		for (int i = 0; i <5; i++)
		{
			System.out.println("yes!");
		}
		
		
		int i = 1;
		while(i<6)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("while 블록 밖에서는 i="+i);
		
		
		int j = 1;
		while(j<6)
		{
			System.out.println('예');
			j++;
		}

		
		int k = 5;
		do
		{
			System.out.println(k);
			k++;
		}while (k>10);
		
		
	}

}
