import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// toUpperCase()는 소문자를 대문자로 바꿔주는 함수
		String text = br.readLine().toUpperCase();

		// 알파벳 26개 배열 생성
		int[] count = new int[26];

		for (int i = 0; i < text.length(); i++) {

			// 입력된 글자 단어로 분할 후 아스키 코드 값으로 배열 위치 지정
			int num = text.charAt(i) - 'A';
			// 알파벳에 따라서 해당 배열에 빈도수 1 증가
			count[num]++;
		}

		int max = 0; // max변수 선언 및 초기화
		char ch = '?'; // ch 변수 값을 '?'로 지정

		for (int i = 0; i < count.length; i++) {

			// 알파벳 빈도수의 값이 max보다 클 때, i값을 증가시키면서 하나씩 비교
			if (count[i] > max) {
				// max값은 알파벳의 빈도수가 제일 큰 값
				max = count[i];
				// ch 변수값은 i값에 대문자 아스키코드 값 더해줌
				ch = (char) (i + 'A');
			}
			// 알파벳 빈도수가 최대값과 같을 경우(빈도수가 같은 경우)
			else if (count[i] == max) {
				// ch 변수값은 '?'
				ch = '?';

			}
		}
		System.out.println(ch);
	}
}