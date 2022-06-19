package day0524;

public class Calculate {

	long add(long a, long b) {
		
//		식 줄이기
		
//		long result;
//		result = a + b;
//		return result;          1)
		
//		long result = a + b;
//		return result;          2)
		
		return a + b;
	}
	
	long subtract (long a, long b) {
		return a - b;
	}
	
	long multiple (long a, long b) {
		return a * b;
	}
	
	double divide (double a, double b) {
		return a / b;
		// 나누기는 정수값이 그대로 안떨어지기 때문에 타입을 잘 맞춰주어야함
	}
}
