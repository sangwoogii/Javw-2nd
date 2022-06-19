package day0524;

public class Recuresive2 {

	public static void main(String[] args) {
		
		System.out.println("sum : " + sum(1));
		// sum(1)이 제일 처음으로 실행되어야함

	}
	
	public static int sum (int num) {
		System.out.println("시작 : " + num);
		
		if (num > 3) {
			System.out.println("끝 : " + num);
			return num;
		} else {
			System.out.println("종료 : " + num);
		}
		return sum (num + 1);
	}

}
