import java.util.Arrays;
import java.util.Scanner;

public class practice_210804_1 {
	public static void main(String[] args) {
		
		int[] arr1 = new int[5]; //�迭 ���� �ܰ�
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr[0] : " + arr1[0]);
		System.out.println("arr[1] : " + arr1[1]);
		System.out.println("arr[2] : " + arr1[2]);
		System.out.println("arr[3] : " + arr1[3]);
		System.out.println("arr[4] : " + arr1[4]);
		
		
		int[] arr2 = {10, 20, 30}; // �迭 ����� �ʱ�ȭ�� ���ÿ�
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println("arr2[2] : " + arr2[2]);
		
		
		//�迭�� �̿��� �л� ����
		String[] name = {"����ȣ", "�̽¿�", "�ں�ȣ", "�̺���", "������"};
		int[] score = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("%s�� ������ �Է��Ͻÿ� : ", name[0]);
		score[0] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��Ͻÿ� : ", name[1]);
		score[1] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��Ͻÿ� : ", name[2]);
		score[2] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��Ͻÿ� : ", name[3]);
		score[3] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��Ͻÿ� : ", name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s ���� : \t%.2f\n", name[0], (double)score[0]);
		System.out.printf("%s ���� : \t%.2f\n", name[1], (double)score[1]);
		System.out.printf("%s ���� : \t%.2f\n", name[2], (double)score[2]);
		System.out.printf("%s ���� : \t%.2f\n", name[3], (double)score[3]);
		System.out.printf("%s ���� : \t%.2f\n", name[4], (double)score[4]);
		
		double ave = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
		System.out.printf("---------------------\n�� �� : \t%.2f" , ave);
		
		scanner.close();
		
		System.out.println();
		
		// �迭 �⺻ �Ӽ�
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		// �迭 ����
		System.out.println("arrAtt1.length : " + arrAtt1.length);
		
		// �迭 ��� ���
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));
		
		// �迭 ��� ����
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		// �迭 ���۷���
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt1 : " + arrAtt2);
		System.out.println("arrAtt1 : " + arrAtt3);
		
		// ������ �迭
		int[][] arrMul = new int[3][2];
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0]));
		System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1]));
		System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2]));	
			
		
		
		
	}

}
