import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Igor_Sokolov on 7/26/2015.
 */
public class RRJOKE_LONG {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(in.readLine().trim());
            int[] x = new int[N];
            int[] y = new int[N];

            for (int n = 0; n < N; n++) {
                StringTokenizer st = new StringTokenizer(in.readLine());

                x[n] = Integer.parseInt(st.nextToken());
                y[n] = Integer.parseInt(st.nextToken());
            }

            int[][] dist = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    dist[i][j] = Math.min(Math.abs(x[j] - x[i]), Math.abs(y[j] - y[i]));
                }
            }

            boolean[] visited = new boolean[N];

            int s = 0;
            int res = 0;
            int count = N;

            while (count > 0) {
                visited[s] = true;
                res ^= (s + 1);

                int next = -1;
                int nextDist = Integer.MAX_VALUE;

                for (int i = 0; i < N; i++) {
                    if (!visited[i] && dist[s][i] < nextDist) {
                        nextDist = dist[s][i];
                        next = i;
                    }
                }

                s = next;
                count--;
            }

            System.out.println(res);
        }
    }
}
