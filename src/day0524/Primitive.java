package day0524;

// JVM 메모리구조   기본형

class Data {
	int x;
}

public class Primitive {
// public을 가지는 클래스는 파일명(Primitive.java와 같이)과
// 동일해야하고 하나의 public에 하나의 클래스만 가지고 있어야함
// public 바깥에서는 class를 여러개 생성해도 상관없음
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change (d.x) ");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change (int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	
}
