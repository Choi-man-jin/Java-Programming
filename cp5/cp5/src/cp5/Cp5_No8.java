package cp5;

public class Cp5_No8 {

	public static void main(String[] args) {
		double time_s, time_m, time_h;							// 초, 분, 시에 해당하는 시간을 실수형으로 선언
		final double DISTANCE = 15e+7;							// 지구 태양사이의 거리를 지수 표기법으로 기호상수 선언 따라서 실수형
		final double SPEED = 3e+5;								// 빛의 속도를 지수 표기법으로 기호상수 선언 따라서 실수형
		final int T_UNIT = 60;									// 시간 단위를 기호상수로 선언
		
		time_s = DISTANCE / SPEED;								// 빛의 속도가 초속이므로 거리 / 속도 값을 시간(초) 변수에 저장
		time_m = time_s / T_UNIT;								// 시간(초)에 시간 단위를 나눠 시간(분)에 저장
		time_h = time_m / T_UNIT;								// 시간(분)에 시간 단위를 나눠 시간(시)에 저장
		
		System.out.println("빛이 지구에 도달하는 시간은 " + time_s + "초, " 
		+ time_m + "분, " + time_h + "시간 입니다.");				// 결과 출력
	}

}