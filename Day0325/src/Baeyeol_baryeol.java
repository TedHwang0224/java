
public class Baeyeol_baryeol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 늘여쓰기
//		int[][] stu;
//		stu = new int[2] [];
//		stu[0]=new int[3];
//		stu[1]=new int[3];

		
		// 늘여쓰기 ver.2
//		int[][] stu = new int[2][3];
//		stu[0][0] = 100;
//		stu[0][1] = 50;
//		stu[0][2] = 20;
		
		int[][] stu = {
						{100, 50, 20}, // 행
						{10, 40, 80} // 열
					};
//		stu = 90;

//		키, 신발사이즈, 형제수
//		a가 10개
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
//		// 40자리(초기 값)에 90으로 바꾸기
//		a1[1][1] = 90;
//		System.out.println(a1[1][1]);
//		
//		int[][] a2 = new int[10][3];
//		a2[0][0] = 0;
//		a2[0][1] = 1;
//		a2[0][2] = 2;
//		// for 사용 (for, i, i)
//		for (int i = 0; i<a2[0].length; i++)
//			{
//				System.out.println(a2[0][i]);
//			}
		
//		int[][]a3;
//		a3 = new int[10][3]; // 
		int[][] a3 = new int[10][3];
		for(int i2=0; i2<10; i2++) // 행
		{
			for(int j=0; j<3; j++) // 열
				{
					a3[i2][j] = j; // 값 할당.
					System.out.println(a3[i2][j]);
				}
		}
		
		
		// 배열 2차원 사용해서 값 담기, char의 2차원 배열, // a p p l e - 0행 // l e m o n - 1행 // 0열1열...4열까지 5개
		char[][]fruit;  // 선언 // 데이터 타입 char[][] <-- 참조타입, 주소값, 4byte
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
