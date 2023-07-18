import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 팰린드롭 문자열 입력받기
		String s = br.readLine();

        // 앞, 뒤 문자열 비교 반복문
		for (int i = 0; i < s.length(); i++) {
			// 입력받은 문자열 charAt를 이용해서 문자로 분리
			char front = s.charAt(i); // 앞에서 i번째 문자 1개
			char back = s.charAt((s.length() - 1) - i); // 뒤에서 i번째 문자 1개

            // 앞과 뒤가 다를 경우 0 출력문
			if (front != back) {
				System.out.println(0);
				return;
			}

		}
        
        // 같을 경우 1 출력
		System.out.println(1);

	}

}
