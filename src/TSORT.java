import java.io.*;

/**
 * Created by Igor_Sokolov on 8/22/2015.
 */
public class TSORT {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"));

        int T = Integer.parseInt(in.readLine().trim());

        int[] m = new int[1000001];
        for (int t = 0; t < T; t++) {
            m[Integer.parseInt(in.readLine())]++;
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i]; j++) {
                out.append(Integer.toString(i));
                out.newLine();
            }
        }

        out.flush();
    }
}
