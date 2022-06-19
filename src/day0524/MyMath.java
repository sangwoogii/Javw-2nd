package day0524;

public class MyMath {

	long a, b; // 인스턴스 변수 2개 생성
	static int c = 20; // 클래스 변수
	
	long add() { // 인스턴스 메서드 생성
		return a + b;
	}
	
	static void test() { // 클래스메서드 생성
		System.out.println("c : " + c);
		
		MyMath m = new MyMath();
		System.out.println("a : " + m.a);
		// static 안에 인스턴스변수를 사용하고 싶으면 객체를 하나 만들거나
		// 보통은 static을 지우고 사용한다.
	}
	
	static long add(long a, long b) { // 스태틱(클래스)메서드 생성
		return a + b; // 스태틱이 없어도 가능 하지만 구분하기 위해 static입력
	}
}
