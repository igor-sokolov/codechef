import java.io.*;

/**
 * Created by Igor_Sokolov on 8/23/2015.
 */
public class TWOSTR {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < T; t++) {
            String s1 = in.readLine();
            String s2 = in.readLine();

            if (match(s1, s2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean match(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (ch1 == ch2) {
                continue;
            }

            if (ch1 != '?') {
                char t = ch1;
                ch1 = ch2;
                ch2 = t;
            }

            if (ch1 == '?' && ch2 >= 'a' && ch2 <= 'z') {
                continue;
            }

            return false;
        }

        return true;
    }
}
