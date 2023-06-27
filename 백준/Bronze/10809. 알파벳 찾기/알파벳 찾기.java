import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] positions = new int[26];
        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1;
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int index = c - 'a';

            if (positions[index] == -1) {
                positions[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(positions[i] + " ");
        }
    }
}
