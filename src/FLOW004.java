import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igor_Sokolov on 7/14/2015.
 */
public class FLOW004 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine().trim());

        for (int i = 0; i < N; i++) {
            String line = in.readLine().trim();
            int result = line.charAt(0) + line.charAt(line.length() - 1) - 2 * '0';
            System.out.println(result);
        }
    }
}
