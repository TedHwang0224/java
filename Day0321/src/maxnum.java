
public class maxnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[] {15, 8, 26};
		// ���� ū ���� ����Ͻÿ�.
		int max = num[0];
		for (int a = 0; a < 3; a++)
		{
			if(num[a] > max)
			{
				max = num[a];
			}
			else
			{
				
			}
		}
		System.out.println("max = "+ max);
	}

}
