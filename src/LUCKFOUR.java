import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igor_Sokolov on 7/15/2015.
 */
public class LUCKFOUR {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < T; t++) {
            String line = in.readLine();

            int result = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '4') {
                    result++;
                }
            }

            System.out.println(result);
        }
    }
}
