package pko4_2;

public class ChTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char aVar='A';
		System.out.println("aVar : " + aVar);
		System.out.println("aVar : " + (int)aVar);
		
		char bVar='B';
		System.out.println("bVar : " + bVar);
		System.out.println("bVar : " + (int)bVar);
		
		char cVar='a';
		System.out.println("cVar : " + cVar);
		System.out.println("cVar : " + (int)cVar);
		
		int result = ((int)aVar+1);//B의 코드값.//66
		System.out.println((char)result);
	
	}

}
