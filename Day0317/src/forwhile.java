
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
//			System.out.println("��"+i);
//			for(int j = 0; j<3; j++)
//			{
//				System.out.println("�ƴϿ�"+j); // 2 X 3 = �ƴϿ� 6�� ���� & �� �� ���� 2�� ���ͼ� �� 8�� ��µǾ���. 
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
		System.out.println("while ���� �ۿ����� i="+i);
		
		
		int j = 1;
		while(j<6)
		{
			System.out.println('��');
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