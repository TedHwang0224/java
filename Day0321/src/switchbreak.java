
public class switchbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;
		switch (a)
		{
		case 10:
			System.out.println("10�̴�.");
			break;
		case 20:
			System.out.println("20�̴�.");
			break;
		case 30:
			System.out.println("30�̴�.");
			break;
		default:
			System.out.println("�� �̿��� ��");
			break;
		}
		
		
		
		int c = 20;
		switch (c)
		{
		case 10:
			System.out.println("10�̴�.");
		case 20:
			System.out.println("20�̴�.");
		case 30:
			System.out.println("30�̴�.");
		default:
			System.out.println("�� �̿��� ��");
		}
		
		
		
		int b = 50;
		if (b == 10)
		{
			System.out.println("10�̴�.");
		}
		else if (b == 20)
		{
			System.out.println("20�̴�.");
		}
		else if (b == 30)
		{
			System.out.println("30�̴�.");
		}
		else 
			System.out.println("�� �̿��� ��");
		
		
		
		int d = 85;
		switch (d)
		{
		case 90,91,92,93,94,95,96,97,98,99,100 :
			System.out.println("��");
			break;
		case 80,81,82,83,84,85,86,87,88,89 :
			System.out.println("��");
			break;
		case 70,71,72,73,74,75,76,77,78,79 :
			System.out.println("��");
			break;
		case 60,61,62,63,64,65,66,67,68,69 :
			System.out.println("��");
			break;
		default:
			System.out.println("��");
			break;
		}
		
		
		
		int e;
		for(e=1; e<=10; e++)
		{
			if(e%2==0)
			{
				continue;
			}
			System.out.print(e+"\t");
		}
		
		
		
		System.out.println("---------");
		
		
		
		int f,g,max=0;
		test:
			for(f=1; f<=5; f++)
			{
				max=f;
				g=1;
				while(true)
				{
					System.out.print(g+"\t");
					if(g==max)
					{
						System.out.println();
						continue test;
					}
					g++;
				}
			}
		
		
		
		for(int h = 5; h >= 1; h--)
		{
			System.out.println('*');
		}
		
		
		System.out.println("---------");
		
		
		for(int h = 3; h > 0; h--)
		{
			System.out.println('*');
			System.out.println("11");
			// System.out.print("*11");
		}
		
		
		System.out.println("---------");
		
		
		for(int h = 1; h <= 3; h++)
		{
			System.out.println("**");
			System.out.println(h);
		}
		
		
		
		System.out.println("---------");
	}

}
