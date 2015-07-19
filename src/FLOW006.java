import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igor_Sokolov on 7/14/2015.
 */
public class FLOW006 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        for (int i = 0; i < N; i++) {
            String line = in.readLine();
            long result = 0;
            for (int j = 0; j < line.length(); j++) {
                result += line.charAt(j) - '0';
            }

            System.out.println(result);
        }
    }
}
