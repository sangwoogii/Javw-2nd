package day0524;

public class Recuresive4 {

	public static void main(String[] args) {
		// 피보나치 수열
		// 숫자의 앞에 값이 뒤의 값과 더하면서 계속해서 증가하는 규칙
		// 만약 0부터 시작하면
		// 1, 1, 2, 3, 5, 8, 13, 21 ...
		System.out.println("n번째 fibonacci의 위치는 " + fibonacci(6));
	}
	
	public static int fibonacci (int n) {
		// 재귀함수 사용
		if (n == 1) return 1;
		if (n == 2) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
		
		
		

		
//		반복문 사용
//		int f = 1; // 첫번째
//		int s = 1; // 처음 시작은 1,1로 시작하기 때문, 두번째
//		int t = f + s; // 3번째, 3번째부터 더한값이 나와야하기 때문에
//		int result = 0;
//		int i = 2;
//		
//		System.out.println(f);
//		System.out.println(s);
//		
//		while (i < n) {
//			if (n == 1 || n == 2)
//				result = 1;
//			
//			System.out.println(t);
//			result = t;
//			
//			f = s;
//			s = t;
//			t = f + s;
//			i++;
//		}
//		
//		return t;
	}

}
