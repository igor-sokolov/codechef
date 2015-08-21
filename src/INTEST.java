import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Igor_Sokolov on 8/21/2015.
 */
public class INTEST {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long res = 0;
        for (int i = 0; i < N; i++) {
            int t = Integer.parseInt(in.readLine());
            if (t % K == 0) {
                res++;
            }
        }

        System.out.print(res);
    }
}
