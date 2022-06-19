package day0524;

// 참조형

//class Data {
//	int x;
//} 

public class Reference {

	public static void main(String[] args) {
		Data d = new Data(); // 인스턴스 생성
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change (d) ");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change (Data d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
	
}
