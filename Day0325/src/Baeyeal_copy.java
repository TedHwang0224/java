
public class Baeyeal_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		int i;
		for(i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		System.out.println("�迭 arr1�� �ּ�(���� ��)"+ arr1[0]);
		System.out.println("�迭 arr2�� �ּ�(���� ��)"+ arr2[2]);
		
		int [] arr3 = new int[4];
		arr3[0] = arr1[1];
		arr3[1] = arr1[2];
		arr3[2] = arr1[3];
		arr3[3] = 10;
	}

}
