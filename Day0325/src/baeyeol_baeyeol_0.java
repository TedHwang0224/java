
public class baeyeol_baeyeol_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[5][5];
		for (int i =0; i<5; i++)
		{
			for(int j =0; j<5; j++)
			{
				a[i][j] = i+1;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		System.out.println("---------------");
		
		
		
		int[][] b = new int[5][5];
		for (int i =0; i<5; i++)
		{
			for(int j =0; j<5; j++)
			{
				b[i][j] = j+1;
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		System.out.println("---------------");
		
		
		
		int[][] c = new int[5][5];
		for (int i =0; i<5; i++)
		{
			for(int j =0; j<5; j++)
			{
				c[i][j] = i+1+j*5;
//				int m = (i+5)*(j+1);
//				c[i][j] = m;
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		System.out.println("---------------");
		
		
		
		int[][] d = new int[5][5];
		int e = 1;
		for (int i =0; i<5; i++)
		{
			for(int j =0; j<=i; j++)
			{
//				if(i>=j)
				{
					System.out.print(d[i][j] + e++ + "\t");
				}
			}
			System.out.println();
		}
		
		
		
		System.out.println("---------------");
		
		
		
		int[][] f = new int[5][5];
		int g = 1;
		for (int i =0; i<5; i++)
		{
			for(int j =0; j<=i; j++)
			{
				{
					System.out.print(f[i][j] + g++ * 2 + "\t");
				}
			}
			System.out.println();
		}
		
		
		
		System.out.println("---------------");
		
		
		
		int[][] h = new int[5][5];
		int k = 1;
		for (int i =0; i<5; i++)
		{
			for(int j =4; j>=i; j--)
			{
				System.out.print(h[j][i] + k++ + "\t");
			}
			System.out.println();
		}
		

		
		System.out.println("---------------");
		
		
		
		int[][] l = new int[5][5];
		int m = 1;
		for (int i =0; i<5; i++)
		{
			for(int j =4; j>=i; j--)
			{
				System.out.print(l[j][i] + m++ * 2 + "\t");
			}
			System.out.println();
		}
		
		
		
		System.out.println("---------------");
		
		
		
		
	}

}
