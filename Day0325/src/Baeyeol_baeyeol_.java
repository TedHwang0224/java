
public class Baeyeol_baeyeol_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단

		int [][]a = new int[10][10];
		for (int i = 2; i < a.length; i++)
		{
			for (int j = 1; j < a[1].length; j++)
			{
				a[i][j] = i * j;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();

		}
		
		
		// score // 5행 3열 // int
//		int[][] score = new int[5][3];	
		
		
		System.out.println();
		System.out.println("----------");
		
		// 숙제
		int[][] b = new int[5][5]; // 5x5 배열선언
		int c = 1; // 배열에 대입할 첫번째 수를 c에 선언 및 초기화
		for (int i =0; i<5; i++) // 배열 b의 행 길이 만큼 반복수행
		{
			for(int j =0; j<5; j++) // 배열 b의 열 길이 만큼 반복수행
			{
				b[i][j] = c++; // 앞에 c를 대입 // c를 1씩 증가
				System.out.print(b[i][j]+"\t"); // 배열 b에 들어있는 수를 출력
				//c++; // (1 3 5 7 9 이런식으로 뜸)
			}
			System.out.println(); // 줄바꿈
		}
//		b[0][0] = 1;
//		b[0][1] = 2;
//		b[0][2] = 3;
//		b[0][3] = 4;
//		b[0][4] = 5;
		
//		for (int i =0; i<5; i++)
//		{
//			for(int j =0; j<5; j++)
//			{
//				c=b[i][j]=(i+j)+1;
//				System.out.print(b[i][j]+"\t"); 
//			}
//			System.out.println();
//		}	
//		
		
		
		
//		b[1][0] = 6;
//		b[1][1] = 7;
//		b[1][2] = 8;
//		b[1][3] = 9;
//		b[1][4] = 10;
//		
//		b[2][0] = 11;
//		b[2][1] = 12;
//		b[2][2] = 13;
//		b[2][3] = 14;
//		b[2][4] = 15;
//		
//		b[3][0] = 16;
//		b[3][1] = 17;
//		b[3][2] = 18;
//		b[3][3] = 19;
//		b[3][4] = 20;
//		
//		b[4][0] = 21;
//		b[4][1] = 22;
//		b[4][2] = 23;
//		b[4][3] = 24;
//		b[4][4] = 25;
////		for (int k=0; k<b[0].length; k++)
//		{
//			for (int l=0; l<b[1].length; l++)
//			{
//				l++;
//				if(l==5)
//				System.out.print(b[k][l] + "\t");
//			}
//			System.out.println();
//		}
		
		
	}

}
