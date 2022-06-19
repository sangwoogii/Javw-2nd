package day0524;

public class CarSta {
	// 클래스 메서드
	
	static int sum = 0; // static이 붙으면 클래스 변수
	int num;
	double gas;
	
	public CarSta() { // 생성자 -> 제일먼저 호출? 객체를 생성할 때 자동으로 실행됨
		sum++;
	}
	
	void setCarSta (int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량번호 : " + num + ", 연료량 : " + gas + "로 설정");
	}
	
	public static void showSumSta() {
//		System.out.println("차량번호 : " + num);
//		num은 인스턴스 변수이고 showSumSta는 클래스메서드이기 때문에 에러가뜸
		System.out.println("자동차의 수 : " + sum + "대");
	}
	
	void showCarSta() {
		System.out.println("차량번호 : " + num);
		System.out.println("연료량 : " + gas);
	}
	
	// 메인 만들기
}
