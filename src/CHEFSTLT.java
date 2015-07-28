import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igor_Sokolov on 7/27/2015.
 */
public class CHEFSTLT {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < T; t++) {
            String s1 = in.readLine();
            String s2 = in.readLine();

            int min = 0;
            int max = 0;

            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == '?' || s2.charAt(i) == '?') {
                    max++;
                    continue;
                }

                if (s1.charAt(i) != s2.charAt(i)) {
                    max++;
                    min++;
                }
            }

            System.out.printf("%d %d%n", min, max);
        }
    }
}
