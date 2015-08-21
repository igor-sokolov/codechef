import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igor_Sokolov on 7/27/2015.
 */
public class TRISQ {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < T; t++) {
            int B = Integer.parseInt(in.readLine().trim());
            System.out.println(fibonacci(B / 2 - 1));
        }
    }

    private static long fibonacci(int n) {
        long res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }

        return res;
    }

}
