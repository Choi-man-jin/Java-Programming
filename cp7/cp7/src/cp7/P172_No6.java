package cp7;

import java.util.Scanner;							// �Է��� �ޱ� ���� Scanner Ŭ���� ���

class Count_Num{									// ����, ������ ������ ���� Ŭ���� ����
	void count() {									// ����, ������ ������ ���� �޼ҵ� ����
		String msg;									// ���ڿ�, ���ڿ��� ���� �ʵ� ����
		int len;									
		int count_vow = 0, count_con = 0;			// ����, ������ ������ ������ �ʵ� 0���� �ʱ�ȭ
	
		Scanner sc = new Scanner(System.in);		// Scanner�� ��ü sc ����
		System.out.print("���ڿ��� �Է��Ͻÿ�. : ");		// �Է� �ȳ��� ���
		msg = sc.nextLine();						// �Է¹��� ���ڿ� msg�� ����
	
		len = msg.length();							// msg�� ���� len�� ����
		for (int i=0; i<=(len-1); i++) {			// for������ ���ڿ��� 0�������� ������ ��������
			switch(msg.charAt(i)){					// switch������ �����̸�
			case 'A':	case 'a':	case 'E':	case 'e':
			case 'I': 	case 'i':	case 'O': 	case 'o':
			case 'U': 	case 'u':
				count_vow += 1;						// ���� ���� 1 �����ϰ�
				break;								// switch�� Ż��
				
			default:								// ���������� ������ �ƴϸ�
				if (msg.charAt(i) != ' ') {
					count_con += 1;					// ���� ���� 1�����ϰ�
					break;							// switch�� Ż��
				}
			}
		}
		System.out.println("���� ���� : " + count_vow + "��"); 		// ��� ���
		System.out.println("���� ���� : " + count_con + "��");	
		sc.close();									// Scanner�� ��ü�� �ݾ���
	}
}

public class P172_No6 {

	public static void main(String[] args) {
		Count_Num s1 = new Count_Num();				// Count_Num Ŭ������ ��ü s1 ����
		s1.count();									// ��ü�� ���ڿ����� ����, ������
	}												// ������ ���ϴ� �޼ҵ� ȣ��
}