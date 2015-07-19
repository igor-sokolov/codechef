import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Igor_Sokolov on 7/14/2015.
 */
public class ELPHANT {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer firstLine = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(firstLine.nextToken());
        int L = Integer.parseInt(firstLine.nextToken());
        int M = Integer.parseInt(firstLine.nextToken());

        int[] pos = new int[N];
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            pos[i] = Integer.parseInt(st.nextToken());
            addValue(pos[i], map);
        }

        int answer = evaluate(map, L);

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int e = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            boolean flag = removeValue(pos[e], map);

            pos[e] = y;

            flag  |= addValue(pos[e], map);

            if (flag) {
                answer = evaluate(map, L);
            }

            System.out.println(answer);
        }
    }

    private static boolean removeValue(int value, TreeMap<Integer, Integer> map) {
        Integer number = map.get(value);
        if (number == null) {
            throw new IllegalStateException();
        }

        if (number == 1) {
            map.remove(value);
            return true;
        } else {
            map.put(value, number - 1);
            return false;
        }
    }

    private static boolean addValue(int po, TreeMap<Integer, Integer> map) {
        Integer number = map.get(po);
        if (number == null) {
            map.put(po, 1);
            return true;
        } else {
            map.put(po, number + 1);
            return false;
        }
    }

    private static int evaluate(TreeMap<Integer, Integer> map, int L) {
        int result = 1;
        int y = map.firstKey();

        while (true) {
            Integer nextKey = map.higherKey(y + L);
            if (nextKey == null) {
                break;
            }

            y = nextKey;
            result++;
        }

        return result;
    }
}
