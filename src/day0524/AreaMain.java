package day0524;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
	
		AreaCalculator result = new AreaCalculator();
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("가로 길이 : ");
		result.width = s.nextInt();
		
		System.out.print("세로 길이 : ");
		result.height = s.nextInt();
		
		int num = result.areaResult(result.width, result.height);
		
		System.out.println("가로 길이가 " + result.width + "이고 " + "세로 길이가 " + result.height + "인 직사각형의 면적은 " + num + "입니다.");

		s.close();

		
//		Scanner s = new Scanner(System.in);
//		
//		AreaCalculator cal = new AreaCalculator();
//		
//		System.out.print("가로 길이 : ");
//		cal.width = s.nextInt();
//		
//		System.out.print("세로 길이 : ");
//		cal.height = s.nextInt();
//		
//		int total = cal.areaResult(cal.width, cal.height);
//		System.out.printf("가로 길이가 %d 이고 세로 길이가 %d인 직사각형의 면적은 %d입니다.", cal.width, cal.height, total);
//		
//		s.close();
	}

}
