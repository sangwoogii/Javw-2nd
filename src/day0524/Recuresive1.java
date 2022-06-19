package day0524;

public class Recuresive1 {

	public static void main(String[] args) {
		
		long result = factorial(4);
		System.out.println( "4! = " + result);
	}
	
		// 3! = 3 * 2 * 1
		static long factorial (int n) {
			long result = 0;
		
			if (n == 1) {
				return 1;
			} else {
				result = n * factorial (n-1);
			}
			
			return result;
		}
		
		
		
		
		// 팩토리얼
		// 5! = 5 * 4 * 3 * 2 * 1
		
//		int fac = 5;
//		int total = 1; // 곱하기를 할 것이기 때문에 초기값 1 설정
//		
//		while (fac != 0) { // 팩토리얼이 0이 아닐때까지 반복한다는 의미
//			total *= fac;
//			fac--;
//		}
//		
//		System.out.println("5! = " + total);
		
		
	

}
