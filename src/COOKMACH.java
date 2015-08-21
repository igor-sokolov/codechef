import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Igor_Sokolov on 8/13/2015.
 */
public class COOKMACH {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int res = 0;
            int ones = getNumberOfOnes(A);
            while (ones != 1) {
                if (A % 2 == 1) ones--;
                A >>= 1;
                res++;
            }

            if (A > B) {
                int C = A;
                A = B;
                B = C;
            }

            while (A != B) {
                A <<= 1;
                res++;
            }

            System.out.println(res);
        }
    }

    private static int getNumberOfOnes(int v) {
        int res = 0;
        while (v != 0) {
            if (v % 2 != 0) res++;
            v >>= 1;
        }

        return res;
    }
}
