import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String input = sc.next();
		int sum = 0;

		for (int i = 0; i < N; i++) {
			// 아스키 코드의 값이 반환되기 때문에 '0'또는 48을 빼줘야 함. (문자를 숫자로 변환하기 위하여)
			// 0~9까지 아스키 코드 값이 48~57로 할당되어 있어서 '0'또는 48을 빼줘야 숫자 값으로 변환됨
			sum += input.charAt(i)-'0';
		}

		System.out.println(sum);
	}

}