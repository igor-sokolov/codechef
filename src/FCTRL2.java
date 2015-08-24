import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by Igor_Sokolov on 8/21/2015.
 */
public class FCTRL2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(in.readLine());
            BigInteger z = getZ(n);
            System.out.println(z);
        }
    }

    private static BigInteger getZ(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }

        return res;
    }
}
