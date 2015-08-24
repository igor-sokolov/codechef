import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by Igor_Sokolov on 8/22/2015.
 */
public class TLG {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine().trim());

        int maxLead = Integer.MIN_VALUE;
        int globalWinner = 1;

        int total1 = 0;
        int total2 = 0;

        for (int t = 0; t < N; t++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int w1 = Integer.parseInt(st.nextToken());
            int w2 = Integer.parseInt(st.nextToken());

            total1 += w1;
            total2 += w2;

            final int lead;
            final int winner;
            if (total1 - total2 > 0) {
                winner = 1;
                lead = total1 - total2;
            } else {
                winner = 2;
                lead = total2 - total1;
            }

            if (lead >= maxLead) {
                maxLead = lead;
                globalWinner = winner;
            }
        }

        System.out.printf("%d %d%n", globalWinner, maxLead);
    }
}
