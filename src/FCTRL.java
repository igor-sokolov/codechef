import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igor_Sokolov on 8/21/2015.
 */
public class FCTRL {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(in.readLine());
            int z = getZ(n);
            System.out.println(z);

        }
    }

    private static int getZ(int n) {
        int res = 0;
        while (n >= 5) {
            n /= 5;
            res += n;
        }

        return res;
    }
}
