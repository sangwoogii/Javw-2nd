package day0524;

public class MyMathMain1 {

	public static void main(String[] args) {
		
		MyMath1 mm1 = new MyMath1();
		
		System.out.println(mm1.add(10,20));
		System.out.println(mm1.add(10.2f, 20.3f));
		
		int [] arr = {10, 20, 30};
		System.out.println(mm1.add(arr));
	}
	
	// 임의의 값을 넣어 MyMath1 확인하는 법
	
	
	
}
