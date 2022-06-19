package day0524;

public class StaticClass {

	public static void main(String[] args) {
		
		CarSta.showSumSta();
		// 스태틱메서드는 객체 생성없이 그냥 사용가능하기 때문에 그냥 사용함
		
		CarSta cs1 = new CarSta();
		cs1.setCarSta(1111, 11.22);
		
		CarSta.showSumSta();

		CarSta cs2 = new CarSta();
		CarSta.showSumSta();
		
		CarSta cs3 = new CarSta();
		CarSta.showSumSta();
		
	}

}
