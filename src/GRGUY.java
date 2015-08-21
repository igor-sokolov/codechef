import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igor_Sokolov on 8/13/2015.
 */
public class GRGUY {
    private static final int MAX = Integer.MAX_VALUE / 2;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine().trim());

        int[][] steps = new int[2][2 * 100000 + 10];
        steps[0][0] = 0;
        steps[1][0] = 0;

        for (int t = 0; t < T; t++) {
            char[] line1 = in.readLine().toCharArray();
            int L = line1.length;

            boolean res = true;
            for (int i = 1, j = 0; j < L; i++, j++) {
                int ch = (char)in.read();
                if (line1[j] == '#' && ch == '#') {
                    res = false;
                    break;
                }

                if (line1[j] == '#') {
                    steps[0][i] = MAX;
                } else {
                    steps[0][i] = Math.min(steps[1][i - 1] + 1, steps[0][i - 1]);
                }

                if (ch == '#') {
                    steps[1][i] = MAX;
                } else {
                    steps[1][i] = Math.min(steps[0][i - 1] + 1, steps[1][i - 1]);
                }
            }

            in.readLine();

            System.out.println(res ? "Yes" : "No");
            if (res) {
                System.out.println(Math.min(steps[0][L], steps[1][L]));
            }
        }
    }
}