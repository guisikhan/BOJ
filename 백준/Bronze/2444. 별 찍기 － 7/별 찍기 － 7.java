import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			// 입력값 a-i(반복값)보다 작으면 띄어쓰기 반복
			// ex) a=4면 첫 번째 줄 4-1 = 3번 띄어쓰기 후 for문 탈출
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int k = 1; k <= N - 1; k++) {
			// 입력값 a-i(반복값)보다 작으면 띄어쓰기 반복
			// ex) a=4면 첫 번째 줄 4-1 = 3번 띄어쓰기 후 for문 탈출
			for (int j = 1; j <= k; j++) {
				System.out.print(" ");
			}
			for (int j = 2*N-1; j > 2*k; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
