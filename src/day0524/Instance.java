package day0524;

public class Instance {

	// 인스턴스 메서드 
	
	public static void main(String[] args) {
		
		CarIns car1 = new CarIns(); // 객체 생성

		car1.setCarIns(1234, 20.3);
		car1.showCarIns();
		
		
		System.out.println();
		
		
		CarIns car2 = new CarIns();
		
		car2.setCarIns(2345, 50.2);
		car2.showCarIns();
	}

}
