import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// 다이얼을 돌리는데 걸리는 시간을 저장하는 변수
	// 'time'변수가 public으로 선언되면 다른 클래스에서도 접근할 수 있다.
	// 'time'변수가 static으로 선언되면 해당 변수는 클래스 변수가 된다.
	public static int time;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 다이얼 번호 입력 받기
		// toCharArray() : String 클래스에 속하는 메서드, 문자열을 문자 배열로 변환하는 역할
		// ex) "Hello" -> "H", "E", "L", "L", "O" 개별적으로 출력
		char[] dials = br.readLine().toCharArray();
		
		// 향상된 for문: 배열 요소 값을 순서대로 하나씩 가져와 변수에 대입한다.
		// for(변수 : 배열) {반복실행문}
		// 'c'는 입력된 문자 각 하나씩을 차례대로 가리킴
		for (char c : dials) {
			// 다이얼 번호에 따른 시간 계산
			time += (c - 'A') / 3 + 3;
			
			// 예외처리
			if (c == 'S' || c == 'V' || c == 'Y' || c == 'Z')
				time--;
		}
		System.out.println(time);
	}
}