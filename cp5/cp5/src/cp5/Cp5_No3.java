package cp5;

import java.util.Scanner;							// 입력을 받기위해 Scanner 클래스 사용

public class Cp5_No3 {

	public static void main(String[] args) {
		int height, feet;							// cm 키, feet 부분을 정수형으로 선언
		double i_height, inch;						// inch 키, inch 부분을 실수형으로 선언
		final double INCH = 2.54;					// INCH에 2.54를 저장한 기호상수 선언
		final int FEET = 12;						// FEET에 12를 저장한 기호상수 선언
		
		Scanner in = new Scanner(System.in);		// Scanner 객체 in를 생성
		
		System.out.print("키를 입력하시오. : ");		// 입력 안내문 출력
		height = in.nextInt();						// 입력받은 값을 height 변수에 저장
		
		i_height = height / INCH;					// cm 키에 2.54를 나눠 inch로 변환하여 inch 키 변수에 저장
		feet = (int)(i_height / FEET);				// inch 키를 12로 나눠 feet로 변환한 값을 정수형으로 형변환하여 feet 부분에 저장
		inch = i_height % FEET;						// inch 키를 12로 나눈 나머지를 inch 부분에 저장
		
		System.out.println(height + "cm는 " + feet + "피트 " + inch + "인치입니다.");		// 결과 출력

		in.close();									// Scanner 객체를 닫아줌
	}

}
