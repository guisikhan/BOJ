import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();

		// 문자열 reverse
		String reverse = "";
		for (int i = S.length() - 1; i >= 0; i--) {
			reverse = reverse + S.charAt(i);
		}

		String[] word = reverse.split(" ");

		int a = Integer.parseInt(word[0]);
		int b = Integer.parseInt(word[1]);

		if (a > b) {
			System.out.print(a);
		} else {
			System.out.print(b);
		}

	}
}