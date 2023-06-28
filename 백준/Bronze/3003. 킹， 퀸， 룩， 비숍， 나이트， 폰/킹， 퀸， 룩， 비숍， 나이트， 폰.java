import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주어진 체크 말의 개수 배열로 정의
		int chess[] = { 1, 1, 2, 2, 2, 8 };

		// 6개 숫자를 입력 받는 배열 선언
		int input[] = new int[6];
		String[] inputStr = br.readLine().split(" ");

		for (int i = 0; i < input.length; i++) {
			// 숫자 6개 입력받기
			input[i] = Integer.parseInt(inputStr[i]);

			System.out.print(chess[i] - input[i] + " ");
		}
	}
}