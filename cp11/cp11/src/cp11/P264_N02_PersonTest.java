package cp11;

class Person{												// Person Ŭ����
	private String name;									// �̸�, �ּ�, ��ȭ��ȣ �ʵ�
	private String address;									// private�� ����
	private String P_num;
	
	public Person() {										// Person Ŭ������ default ������
		System.out.println("Person default ������");
	}
	public Person(String n, String a, String p) {			// Person Ŭ������ �Ű����� ������
		name = n;
		address = a;
		P_num = p; 
		System.out.println("Person �Ű����� ������");
	}
	
	public String getName() { return name; }				// �� �ʵ���� ������
	public String getAddress() { return address; }
	public String getP_num() { return P_num; }
	public void setName(String n) { name = n; }				// �� �ʵ���� ������
	public void setAddress(String a) { address = a; }
	public void setP_num(String p) { P_num = p; }
	
	public String toString() {								// ��ü ��½� ȣ��Ǵ� �޼ҵ�
		return "�̸� : " + name + " / �ּ� : " + address + " / ��ȭ��ȣ : " + P_num;
	}
	
	public boolean equals(Object obj) {						// ��ü�� �ʵ��� ������ ������ Ȯ���ϴ� �޼ҵ�
		if (obj instanceof Person) {						// ���� Ŭ������ ��ü���� Ȯ��
			Person other = (Person)obj;						// Object�� Person���� ����ȯ
			if (name.equals(other.name) && address.equals(other.address) && P_num.equals(other.P_num)) 
				return true;								// �ʵ���� ���� �� ������ true ��ȯ
			else
				return false;								// �ٸ��� ������  false ��ȯ
		}
		else
			return false;									// �ٸ� Ŭ������ ��ü�̸� ���Ұ͵� ���� false ��ȯ
	}
}

class Customer extends Person{								// PersonŬ������ ��ӹ޴� CustomerŬ����
	private int C_num;										// ������ȣ, ���ϸ��� �ʵ�
	private int mileage;									// private�� ����
	
	
	public Customer() {										// Customer Ŭ������ default ������
		System.out.println("Customer default ������");
	}
	public Customer(String n, String a, String p, int c, int m) {	// Customer Ŭ������ �Ű����� ������
		super(n, a, p);										// ��� Ŭ������ ������ ȣ��
		C_num = c;
		mileage = m;
		System.out.println("Customer �Ű����� ������");
	}
	
	public int getC_num() { return C_num; }					// �� �ʵ���� ������
	public int getMileage() { return mileage; }
	public void setC_num(int c) { C_num = c; }				// �� �ʵ���� ������
	public void setMileage(int m) { mileage = m; }
	
	public String toString() {								// ��� Ŭ������ toString �޼ҵ� ������
		return super.toString() + " / ������ȣ : " + C_num + " / ���ϸ��� : " + mileage;
	}
	
	public boolean equals(Object obj) {						// Person Ŭ������ equals �޼ҵ� ������
		if (obj instanceof Customer) {						// ���� Ŭ������ ��ü���� Ȯ��
			if (super.equals(obj)) {						// ��� Ŭ������ equals�޼ҵ带 ȣ���� �ʵ尪�� ���ٸ�
				Customer other = (Customer) obj;			// Object�� Customer�� ����ȯ
				if(C_num == other.C_num && mileage == other.mileage)	// CustomerŬ������ �ʵ带 ����
					return true;							// �� ������ true ��ȯ
				else
					return false;							// �ٸ��� ������ false ��ȯ
			}
			else
				return false;								// ���Ŭ�������� �ٸ� �ʵ尡 ������ false��ȯ
		}
		else
			return false;									// Ŭ������ �ٸ��ٸ� ���͵� ���� false��ȯ
	}
}


public class P264_N02_PersonTest {							// �׽�Ʈ Ŭ����

	public static void main(String[] args) {
		Customer c0 = new Customer();						// Customer Ŭ������ ��ü c0 ���� (default ������ ȣ��)
		
		Customer c1 = new Customer("Choi", "Seoul", "123-4567", 12, 153);
		Customer c2 = new Customer("Lee", "Dae-Jeon", "987-6543", 37, 368);
		Customer c3 = new Customer("Choi", "Seoul", "123-4567", 12, 153);
													// Customer Ŭ������ ��ü c1, c2, c3 ���� (�Ű����� ������ ȣ��)

		System.out.println();
		System.out.println("c0 : " + c0);
		System.out.println("c1 : " + c1);					// �� ��ü�� toString�޼ҵ带 ȣ����
		System.out.println("c2 : " + c2);					// �ʵ尪���� ���
		System.out.println("c3 : " + c3);
		
		System.out.println(c1.equals(c2));					// c1, c2�� �ʵ尪���� ������ Ȯ��
		System.out.println(c1.equals(c3));					// c1, c3�� �ʵ尪���� ������ Ȯ��
		System.out.println();	
		
		c1.setName("Hong");									// �����ڸ� ���� c1�� name�ʵ� ���� 
		c3.setC_num(4);										// �����ڸ� ���� c3�� C_num�ʵ� ���� 
		System.out.println("New c1 : " + c1);				// c1�� c3 ��ü ���
		System.out.println("New c3 : " + c3);
		System.out.println(c1.equals(c3));					// c1, c3�� �ʵ尪���� ������ Ȯ��
		
	}
}