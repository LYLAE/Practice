
public class practice_210731_2 {
	public static void main(String[] args) {
	
		
		//�ڵ�(������) �� ��ȯ:
		// ���� ������ �޸𸮿��� ū ������ �޸𸮷� �̵�
		byte by = 10;
		int in = by;
		System.out.println("in = " + in);
		
		//����� �� ��ȯ:
		//ū ������ �޸𸮿��� ���� ������ �޸𸮷� �̵�
		int iVar = 100;
		byte bVar = (byte)iVar;
		System.out.println("bVar = " + bVar);
		
		
		// ����� �� ��ȯ�� ������ ������ ���輺�� ����.
		// �׷��� ������, ó������ int �� double�� ����ϰ� ����.
		iVar = 123456;
		bVar = (byte)iVar;
		System.out.println("bVar = " + bVar);
		
		
		
		
	}

}
