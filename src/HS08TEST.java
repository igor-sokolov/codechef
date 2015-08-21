import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Igor_Sokolov on 8/21/2015.
 */
public class HS08TEST {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        double X = Double.parseDouble(st.nextToken());
        double Y = Double.parseDouble(st.nextToken());

        double diff = Y - X - 0.5;

        double res;
        if (X % 5 != 0) {
            res = Y;
        } else {
            res = diff < 0.0 ? Y : diff;
        }

        System.out.printf("%.2f", res);
    }
}
