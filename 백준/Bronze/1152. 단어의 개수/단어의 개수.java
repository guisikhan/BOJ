import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// 공백만 입력했을 시에 단어의 갯수가 0개가 나와야 할 경우를 생각해주기
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력받은 문자열 양쪽 공백 제거
		String S = br.readLine().trim();

		// 공백을 기준으로 스플릿
		String[] words = S.split(" ");

		// 공백을 입력했을 때 words배열의 원소 갯수가 1이 되고
		// words[0]의 값이 ""가 되기에 이 경우 0이라고 출력
		if (words.length == 1 && words[0].equals("")) {
			System.out.println(0);
		} else {
			System.out.println(words.length);
		}

	}
}
