package cp6;

import java.util.Scanner;										// 입력을 받기 위해 Scanner 클래스 사용

public class P129_Challenge {

	public static void main(String[] args) {
		double divisor, divident, sum;							// 분모, 분자, 합에 해당하는 변수를 실수형으로 선언
		int loop_count, num;									// 반복 횟수, 분모의 값을 결정하는 변수 정수형으로 선언
		long start, end;										// 실행 시간을 재기 위한 변수 long형으로 선언
		
		Scanner sc = new Scanner(System.in);					// Scanner 객체 sc를 생성
		divident = 4.0;											// 각 변수 초기화
		sum = 3.0;
		num = 3;								
		
		System.out.print("반복 횟수 : ");							// 입력 안내문 출력
		loop_count = sc.nextInt();								// 입력 받은 값을 정수형으로 변수에 loop_count 저장
		
		start = System.currentTimeMillis();						// 반복을 시작하기 전 시간 start에 저장
		while(loop_count > 0) {								 	// loop_count가 0이 되면 멈추는 반복문
			divisor = (num - 1.0) * num * (num + 1.0);			// 분모는 처음 num (3)을 기준으로 왼쪽은 num-1, 오른쪽은 num+1 
			sum += divident / divisor;							// 분자/분모 값을 sum에 더함
			divident = -1.0 * divident;							// 반복마다 분자의 부호가 바뀌므로 -1 곱함
			num += 2;											// num을 2씩 증가하고 반복 횟수는 1씩 감소
			loop_count--;
		}
		
		System.out.println("Pi = " + sum);						// 결과 출력
		end = System.currentTimeMillis();						// 반복을 마친뒤 시간 end에 저장
		System.out.print("run time = " + (end - start) + "ms");	// 끝난시간에서 시작시간을 뺸 값을 출력
		sc.close();												// Scanner 객체를 닫아줌
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
		System.out.print("반복 횟수 : ");
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
 