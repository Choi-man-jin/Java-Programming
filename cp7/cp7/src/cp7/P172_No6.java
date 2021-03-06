package cp7;

import java.util.Scanner;							// 입력을 받기 위해 Scanner 클래스 사용

class Count_Num{									// 자음, 모음의 개수를 세는 클래스 정의
	void count() {									// 자음, 모음의 개수를 세는 메소드 정의
		String msg;									// 문자열, 문자열의 길이 필드 정의
		int len;									
		int count_vow = 0, count_con = 0;			// 모음, 자음의 개수를 저장할 필드 0으로 초기화
	
		Scanner sc = new Scanner(System.in);		// Scanner의 객체 sc 생성
		System.out.print("문자열을 입력하시오. : ");		// 입력 안내문 출력
		msg = sc.nextLine();						// 입력받은 문자열 msg에 저장
	
		len = msg.length();							// msg의 길이 len에 저장
		for (int i=0; i<=(len-1); i++) {			// for문으로 문자열의 0번지부터 마지막 번지까지
			switch(msg.charAt(i)){					// switch문으로 모음이면
			case 'A':	case 'a':	case 'E':	case 'e':
			case 'I': 	case 'i':	case 'O': 	case 'o':
			case 'U': 	case 'u':
				count_vow += 1;						// 모음 개수 1 증가하고
				break;								// switch문 탈출
				
			default:								// 나머지에서 공백이 아니면
				if (msg.charAt(i) != ' ') {
					count_con += 1;					// 자음 개수 1증가하고
					break;							// switch문 탈출
				}
			}
		}
		System.out.println("모음 개수 : " + count_vow + "개"); 		// 결과 출력
		System.out.println("자음 개수 : " + count_con + "개");	
		sc.close();									// Scanner의 객체를 닫아줌
	}
}

public class P172_No6 {

	public static void main(String[] args) {
		Count_Num s1 = new Count_Num();				// Count_Num 클래스의 객체 s1 생성
		s1.count();									// 객체의 문자열에서 모음, 자음의
	}												// 개수를 구하는 메소드 호출
}