package calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫 번째 숫자를 입력하세요:");
//		int num1 = sc.nextInt();
//		
//		System.out.println("두 번째 숫자를 입력하세요: ");
//		int num2 = sc.nextInt();
//		
//		int result = num1 + num2;
//		System.out.println("두 수의 합: " + result);
		
		
		
		//풀이
		int a,b;
		// 입력: 키보드로 두 수의 입력을 받는다.
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해주세요: ");
		s1 = sc.next();
		s2 = sc.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		//System.out.println(a  + ", "+ b);
		
		// 출력: 화면에 두 수의 합을 출력한다.
		int c = a + b;
		//System.out.println("두 수의 합: " + c + "입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a+b);
		sc.close();
	}

}
