import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Igor_Sokolov on 7/15/2015.
 */
public class FLOW005 {
    public static void main(String[] args) throws IOException {
        int[] d = {100, 50, 10, 5, 2, 1};

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int n  = Integer.parseInt(st.nextToken());

            int result = 0;
            for (int i = 0; i < d.length; i++) {
                result += n / d[i];
                n %= d[i];
            }

            System.out.println(result);
        }
    }
}
