package day0524;

public class CarIns {

	// 인스턴스 메서드
	
	int num; // 인스턴스 변수
	double gas; // 인스턴스 변수
	
	void setCarIns (int n, double g) { // 인스턴스 메서드
//		num = n;
//		gas = g;
		this.num = n;
		this.gas = g;
	System.out.println("차량 번호 : " + num + ", 연료량 : " + gas + "으로 변경");
	} // 이까지가 인스턴스 메서드
	
	
	void showCarIns() { // 매개변수를 받지 않는 인스턴스 메서드
		System.out.println("차량 번호 : " + num);
		System.out.println("연료량 : " + gas);
	}
}
