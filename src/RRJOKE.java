import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igor_Sokolov on 7/26/2015.
 */
public class RRJOKE {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(in.readLine().trim());

            int res = 0;
            for (int n = 1; n <= N; n++) {
                in.readLine();
                res ^= n;
            }

            System.out.println(res);
        }
    }
}
