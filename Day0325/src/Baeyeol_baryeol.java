
public class Baeyeol_baryeol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ÿ�����
//		int[][] stu;
//		stu = new int[2] [];
//		stu[0]=new int[3];
//		stu[1]=new int[3];

		
		// �ÿ����� ver.2
//		int[][] stu = new int[2][3];
//		stu[0][0] = 100;
//		stu[0][1] = 50;
//		stu[0][2] = 20;
		
		int[][] stu = {
						{100, 50, 20}, // ��
						{10, 40, 80} // ��
					};
//		stu = 90;

//		Ű, �Ź߻�����, ������
//		a�� 10��
//		int a1 = 0;
//		int a2 = 0;
//		...
//		int a10 = 0;
		
//		int[] a = new int[10];
//		a[0]=0;
//		a[1]=10;
//		a[9]=10;
//		
//		int[][] a1 = new int[10][3];
//		a1[0][0] = 100;
//		a1[0][1] = 50;
//		a1[0][2] = 20;
//		a1[1][0] = 10;
//		a1[1][1] = 40;
//		a1[1][2] = 80;
//		// 40�ڸ�(�ʱ� ��)�� 90���� �ٲٱ�
//		a1[1][1] = 90;
//		System.out.println(a1[1][1]);
//		
//		int[][] a2 = new int[10][3];
//		a2[0][0] = 0;
//		a2[0][1] = 1;
//		a2[0][2] = 2;
//		// for ��� (for, i, i)
//		for (int i = 0; i<a2[0].length; i++)
//			{
//				System.out.println(a2[0][i]);
//			}
		
//		int[][]a3;
//		a3 = new int[10][3]; // 
		int[][] a3 = new int[10][3];
		for(int i2=0; i2<10; i2++) // ��
		{
			for(int j=0; j<3; j++) // ��
				{
					a3[i2][j] = j; // �� �Ҵ�.
					System.out.println(a3[i2][j]);
				}
		}
		
		
		// �迭 2���� ����ؼ� �� ���, char�� 2���� �迭, // a p p l e - 0�� // l e m o n - 1�� // 0��1��...4������ 5��
		char[][]fruit;  // ���� // ������ Ÿ�� char[][] <-- ����Ÿ��, �ּҰ�, 4byte
		fruit = new char[2][5];
		fruit[0][0] = 'a';
		fruit[0][1] = 'p';
		fruit[0][2] = 'p';
		fruit[0][3] = 'l';
		fruit[0][4] = 'e';
		fruit[1][0] = 'l';
		fruit[1][1] = 'e';
		fruit[1][2] = 'm';
		fruit[1][3] = 'o';
		fruit[1][4] = 'n';
		
			for(int j2=0; j2<5; j2++)
			{
				System.out.print(fruit[0][j2]);
			}
			System.out.println();
			
			for(int j3=0; j3<=4; j3++)
			{
				System.out.print(fruit[1][j3]);
			}

		
		
	
	}

}
