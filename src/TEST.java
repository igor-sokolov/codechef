import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Igor_Sokolov on 6/26/2015.
 */
public class TEST {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = in.readLine();
            int n = Integer.parseInt(line);
            if (n == 42) {
                return;
            }

            System.out.println(line);
        }
    }
}
