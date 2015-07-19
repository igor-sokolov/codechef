import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igor_Sokolov on 7/14/2015.
 */
public class FLOW018 {
    private static int[] cache = new int[21];

    public static void main(String[] args) throws IOException {
        init();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine().trim());

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(in.readLine().trim());
            System.out.println(cache[value]);
        }
    }

    private static void init() {
        cache[0] = 1;

        for (int i = 1; i < cache.length; i++) {
            cache[i] = i * cache[i - 1];
        }
    }
}
