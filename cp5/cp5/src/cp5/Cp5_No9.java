package cp5;

import java.util.Scanner;									// �Է��� �ޱ����� Scanner Ŭ���� ���

public class Cp5_No9 {

	public static void main(String[] args) {
		double power, area, pressure;						// ���� ũ��, ����, �з� ������ �Ǽ������� ����
		
		Scanner in = new Scanner(System.in);				// Scanner ��ü in ���� 
		
		System.out.print("���� ũ�⸦ �Է��Ͻÿ�. : ");			// �Է� �ȳ��� ���
		power = in.nextDouble();							// �Ǽ������� �Է¹��� ���� ũ�⸦ power ������ ����
		System.out.print("��ü�� ������ �Է��Ͻÿ�. : ");
		area = in.nextDouble();								// �Ǽ������� �Է¹��� ������ area ������ ����
		
		pressure = power / area;							// ���� ũ�⿡ ������ ���� ���� pressure ������ ���� 
		
		System.out.println("�з��� ����� " + pressure + "�Դϴ�."); 		// ��� ���

	}

}