
public class practice_210731_2 {
	public static void main(String[] args) {
	
		
		//자동(묵시적) 형 변환:
		// 작은 공간의 메모리에서 큰 공간의 메모리로 이동
		byte by = 10;
		int in = by;
		System.out.println("in = " + in);
		
		//명시적 형 변환:
		//큰 공간의 메모리에서 작은 공간의 메모리로 이동
		int iVar = 100;
		byte bVar = (byte)iVar;
		System.out.println("bVar = " + bVar);
		
		
		// 명시적 형 변환은 데이터 유실의 위험성이 있음.
		// 그래서 보통은, 처음부터 int 나 double은 사용하고 있음.
		iVar = 123456;
		bVar = (byte)iVar;
		System.out.println("bVar = " + bVar);
		
		
		
		
	}

}
