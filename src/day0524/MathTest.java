package day0524;

public class MathTest {

	public static void main(String[] args) {
		
		int sum; // x,y의 합계를 구하기 위한 변수 생성
		
		Math obj = new Math();   // 객체 생성 (참조변수 생성)
		
		sum = obj.add(2, 3);
		System.out.println("2 + 3 = " + sum);
		
		sum = obj.add(6, 2);
		System.out.println("6 + 2 = " + sum);
		
		obj.add(1, 2);
		// 3이라는 숫자를 가지고 있음, 에러도 아니고 3이라는 숫자를 가지고 있는 상태에서 끝이 난 상태
		
		
//		sum = obj.add(1, 2, 3)
//		sum = obj.add(1.0, 2.0);
//		매개변수를 실행할 땐 매개변수의 개수(add는 현재 2개)와 매개변수의 타입 (현재 int 타입) 이 무조건 동일해야함 

	}

}
