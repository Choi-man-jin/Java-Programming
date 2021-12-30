package cp6;

import java.util.Scanner;										// �Է��� �ޱ� ���� Scanner Ŭ���� ���

public class P129_Challenge {

	public static void main(String[] args) {
		double divisor, divident, sum;							// �и�, ����, �տ� �ش��ϴ� ������ �Ǽ������� ����
		int loop_count, num;									// �ݺ� Ƚ��, �и��� ���� �����ϴ� ���� ���������� ����
		long start, end;										// ���� �ð��� ��� ���� ���� long������ ����
		
		Scanner sc = new Scanner(System.in);					// Scanner ��ü sc�� ����
		divident = 4.0;											// �� ���� �ʱ�ȭ
		sum = 3.0;
		num = 3;								
		
		System.out.print("�ݺ� Ƚ�� : ");							// �Է� �ȳ��� ���
		loop_count = sc.nextInt();								// �Է� ���� ���� ���������� ������ loop_count ����
		
		start = System.currentTimeMillis();						// �ݺ��� �����ϱ� �� �ð� start�� ����
		while(loop_count > 0) {								 	// loop_count�� 0�� �Ǹ� ���ߴ� �ݺ���
			divisor = (num - 1.0) * num * (num + 1.0);			// �и�� ó�� num (3)�� �������� ������ num-1, �������� num+1 
			sum += divident / divisor;							// ����/�и� ���� sum�� ����
			divident = -1.0 * divident;							// �ݺ����� ������ ��ȣ�� �ٲ�Ƿ� -1 ����
			num += 2;											// num�� 2�� �����ϰ� �ݺ� Ƚ���� 1�� ����
			loop_count--;
		}
		
		System.out.println("Pi = " + sum);						// ��� ���
		end = System.currentTimeMillis();						// �ݺ��� ��ģ�� �ð� end�� ����
		System.out.print("run time = " + (end - start) + "ms");	// �����ð����� ���۽ð��� �A ���� ���
		sc.close();												// Scanner ��ü�� �ݾ���
	}
}





/*package cp6;

import java.util.Scanner;

public class P129_Challenge {

	public static void main(String[] args) {
		double divisor, divident, sum;
		int loop_count;
		long start, end;
		
		Scanner sc = new Scanner(System.in);
		divisor = 1.0;
		divident = 4.0;
		sum = 0.0;
		System.out.print("�ݺ� Ƚ�� : ");
		loop_count = sc.nextInt();
		
		start = System.currentTimeMillis();
		while(loop_count > 0) {
			sum = sum + divident / divisor;
			divident = -1.0 * divident;
			divisor = divisor + 2;
			loop_count--;
		}
		
		System.out.println("Pi = " + sum);
		end = System.currentTimeMillis();
		System.out.print("run time = " + (end - start) + "ms");
		sc.close();
	}

}*/
 