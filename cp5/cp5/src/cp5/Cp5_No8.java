package cp5;

public class Cp5_No8 {

	public static void main(String[] args) {
		double time_s, time_m, time_h;							// ��, ��, �ÿ� �ش��ϴ� �ð��� �Ǽ������� ����
		final double DISTANCE = 15e+7;							// ���� �¾������ �Ÿ��� ���� ǥ������� ��ȣ��� ���� ���� �Ǽ���
		final double SPEED = 3e+5;								// ���� �ӵ��� ���� ǥ������� ��ȣ��� ���� ���� �Ǽ���
		final int T_UNIT = 60;									// �ð� ������ ��ȣ����� ����
		
		time_s = DISTANCE / SPEED;								// ���� �ӵ��� �ʼ��̹Ƿ� �Ÿ� / �ӵ� ���� �ð�(��) ������ ����
		time_m = time_s / T_UNIT;								// �ð�(��)�� �ð� ������ ���� �ð�(��)�� ����
		time_h = time_m / T_UNIT;								// �ð�(��)�� �ð� ������ ���� �ð�(��)�� ����
		
		System.out.println("���� ������ �����ϴ� �ð��� " + time_s + "��, " 
		+ time_m + "��, " + time_h + "�ð� �Դϴ�.");				// ��� ���
	}

}