import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by Igor_Sokolov on 7/15/2015.
 */
public class PALL01 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < T; t++) {
            String number = in.readLine().trim();

            int i = 0;
            int j = number.length() - 1;

            while (i < j && number.charAt(i) == number.charAt(j)) {
                i++;
                j--;
            }

            System.out.println(i >= j ? "wins" : "losses");
        }
    }
}
