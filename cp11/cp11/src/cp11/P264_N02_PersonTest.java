package cp11;

class Person{												// Person 클래스
	private String name;									// 이름, 주소, 전화번호 필드
	private String address;									// private로 선언
	private String P_num;
	
	public Person() {										// Person 클래스의 default 생성자
		System.out.println("Person default 생성자");
	}
	public Person(String n, String a, String p) {			// Person 클래스의 매개변수 생성자
		name = n;
		address = a;
		P_num = p; 
		System.out.println("Person 매개변수 생성자");
	}
	
	public String getName() { return name; }				// 각 필드들의 접근자
	public String getAddress() { return address; }
	public String getP_num() { return P_num; }
	public void setName(String n) { name = n; }				// 각 필드들의 설정자
	public void setAddress(String a) { address = a; }
	public void setP_num(String p) { P_num = p; }
	
	public String toString() {								// 객체 출력시 호출되는 메소드
		return "이름 : " + name + " / 주소 : " + address + " / 전화번호 : " + P_num;
	}
	
	public boolean equals(Object obj) {						// 객체안 필드의 내용이 같은지 확인하는 메소드
		if (obj instanceof Person) {						// 동일 클래스의 객체인지 확인
			Person other = (Person)obj;						// Object를 Person으로 형변환
			if (name.equals(other.name) && address.equals(other.address) && P_num.equals(other.P_num)) 
				return true;								// 필드들을 비교해 다 같으면 true 반환
			else
				return false;								// 다른게 있으면  false 반환
		}
		else
			return false;									// 다른 클래스의 객체이면 비교할것도 없이 false 반환
	}
}

class Customer extends Person{								// Person클래스를 상속받는 Customer클래스
	private int C_num;										// 고객번호, 마일리지 필드
	private int mileage;									// private로 선언
	
	
	public Customer() {										// Customer 클래스의 default 생성자
		System.out.println("Customer default 생성자");
	}
	public Customer(String n, String a, String p, int c, int m) {	// Customer 클래스의 매개변수 생성자
		super(n, a, p);										// 기반 클래스의 생성자 호출
		C_num = c;
		mileage = m;
		System.out.println("Customer 매개변수 생성자");
	}
	
	public int getC_num() { return C_num; }					// 각 필드들의 접근자
	public int getMileage() { return mileage; }
	public void setC_num(int c) { C_num = c; }				// 각 필드들의 설정자
	public void setMileage(int m) { mileage = m; }
	
	public String toString() {								// 기반 클래스의 toString 메소드 재정의
		return super.toString() + " / 고객번호 : " + C_num + " / 마일리지 : " + mileage;
	}
	
	public boolean equals(Object obj) {						// Person 클래스의 equals 메소드 재정의
		if (obj instanceof Customer) {						// 동일 클래스의 객체인지 확인
			if (super.equals(obj)) {						// 기반 클래스의 equals메소드를 호출해 필드값이 같다면
				Customer other = (Customer) obj;			// Object를 Customer로 형변환
				if(C_num == other.C_num && mileage == other.mileage)	// Customer클래스의 필드를 비교해
					return true;							// 다 같으면 true 반환
				else
					return false;							// 다른게 있으면 false 반환
			}
			else
				return false;								// 기반클래스에서 다른 필드가 있으면 false반환
		}
		else
			return false;									// 클래스가 다르다면 볼것도 없이 false반환
	}
}


public class P264_N02_PersonTest {							// 테스트 클래스

	public static void main(String[] args) {
		Customer c0 = new Customer();						// Customer 클래스의 객체 c0 생성 (default 생성자 호출)
		
		Customer c1 = new Customer("Choi", "Seoul", "123-4567", 12, 153);
		Customer c2 = new Customer("Lee", "Dae-Jeon", "987-6543", 37, 368);
		Customer c3 = new Customer("Choi", "Seoul", "123-4567", 12, 153);
													// Customer 클래스의 객체 c1, c2, c3 생성 (매개변수 생성자 호출)

		System.out.println();
		System.out.println("c0 : " + c0);
		System.out.println("c1 : " + c1);					// 각 객체의 toString메소드를 호출해
		System.out.println("c2 : " + c2);					// 필드값들을 출력
		System.out.println("c3 : " + c3);
		
		System.out.println(c1.equals(c2));					// c1, c2의 필드값들이 같은지 확인
		System.out.println(c1.equals(c3));					// c1, c3의 필드값들이 같은지 확인
		System.out.println();	
		
		c1.setName("Hong");									// 설정자를 통해 c1의 name필드 변경 
		c3.setC_num(4);										// 설정자를 통해 c3의 C_num필드 변경 
		System.out.println("New c1 : " + c1);				// c1과 c3 객체 출력
		System.out.println("New c3 : " + c3);
		System.out.println(c1.equals(c3));					// c1, c3의 필드값들이 같은지 확인
		
	}
}
