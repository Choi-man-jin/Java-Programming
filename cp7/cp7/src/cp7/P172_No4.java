package cp7;

class Movie {										// Movie Ŭ���� ����
	String title; 									// ����, ����, ����, ������ �ش��ϴ�
	double rate;									// �ʵ带 �˸��� �ڷ������� ����
	String director;
	String year;
	
	void print() {									// ������ ����ϴ� �޼ҵ� ����
		System.out.println("��ȭ ����: "+ title);		
		System.out.println("����: "+ rate);
		System.out.println("����: "+ director);
		System.out.println("���� ����: "+ year);
	}
}

public class P172_No4 {

	public static void main(String[] args) {

		Movie m1 = new Movie();						// Movie Ŭ������ ��ü m1�� ����
		m1.title = "TransFormers";					// ��ü�� �ʵ� ����
		m1.rate = 4.5;
		m1.director = "Michael Bay";
		m1.year = "2007-6-28";
		m1.print();									// ��ü�� ���� ��� �޼ҵ� ȣ��
	}
}