
import java.util.Scanner;
public class Scannerfor {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[] {1,2,3,4,5};
		int i;
		// �ʱ�ȭ�� �� ���
		System.out.println("�ʱ�ȭ �� �� ���");
		for(i=0; i<intArr.length; i++)
		{
			System.out.println(intArr[i]+"\t");
		}
		System.out.println();
		
		// ����ڿ��� �Է¹޾� �迭�� ����
		System.out.println("���� 5���� �Է��Ͻÿ�");
		for(i=0; i<intArr.length; i++)
		{
			intArr[i] = sc.nextInt();
		}
		
		//�迭�� ����� �� ���
		System.out.println("�迭�� ����� �� ���");
		for(i=0; i<intArr.length; i++)
		{
			System.out.println(intArr[i]+"\t");
		}
		
		
		
		System.out.println("---------------------");
		
		
		
		final int MONTH = 12;
		String[] arrString = {"January", "February", "March", "April", "May", "June", "July", 
				"August", "September", "October", "November", "December"};
		String[] arrStringKor = new String[MONTH];
		int j;
		System.out.println("�����");
		for(j=0; j<arrString.length; j++)
		{
			System.out.println(arrString[j]);
		}
		for(j=0; j<arrStringKor.length; j++)
		{
			arrStringKor[j] = (j+1) + "��";
		}
		System.out.println("�ѱ۷�");
		for(j=0; j<arrStringKor.length; j++)
		{
			System.out.println(arrStringKor[j]);
		}
		
		
		
		System.out.println("---------------------");
		
		
		
		String str = new String("hello");
		String[] strArr = new String[3];
		strArr[3] = "hello3";
		System.out.println(strArr[2]+"//3");
	}

}
