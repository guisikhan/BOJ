import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 크로아티아 문자열 입력
		String text = br.readLine();

		// 크로아티아 문자열 배열 선언
		String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (int i = 0; i < croatia.length; i++) {
			
			// contains 메서드 : 해당 문자열이 존재하면 true 아니면 false
			if (text.contains(croatia[i])) {
				// replace 메서드 : replace([기존문자], [바꿀문자])
				text = text.replace(croatia[i], "i");
			}
		}
		// 크로아티아 알파벳 개수 출력
		System.out.println(text.length());
	}
}
