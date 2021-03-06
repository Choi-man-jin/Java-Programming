package cp7;

class Movie {										// Movie 클래스 정의
	String title; 									// 제목, 평점, 감독, 연도에 해당하는
	double rate;									// 필드를 알맞은 자료형으로 정의
	String director;
	String year;
	
	void print() {									// 정보를 출력하는 메소드 정의
		System.out.println("영화 제목: "+ title);		
		System.out.println("평점: "+ rate);
		System.out.println("감독: "+ director);
		System.out.println("개봉 연도: "+ year);
	}
}

public class P172_No4 {

	public static void main(String[] args) {

		Movie m1 = new Movie();						// Movie 클래스의 객체 m1을 생성
		m1.title = "TransFormers";					// 객체의 필드 변경
		m1.rate = 4.5;
		m1.director = "Michael Bay";
		m1.year = "2007-6-28";
		m1.print();									// 객체의 정보 출력 메소드 호출
	}
}
