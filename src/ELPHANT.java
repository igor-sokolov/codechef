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
        TreeMap<Integer, Integer> elephants = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            pos[i] = Integer.parseInt(st.nextToken());
            addValue(pos[i], elephants);
        }

        TreeSet<Integer> cameras = evaluate(elephants, L);

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            int elephant = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            step(elephants, cameras, pos, elephant, y, L);

            System.out.println(cameras.size());
        }
    }

    private static void moveToLeft(TreeMap<Integer, Integer> elephants,
                                   TreeSet<Integer> cameras, int oldCamera, int newPos, int L) {
        Integer nextE = elephants.higherKey(newPos);

        // if there is next elephant
        while (nextE != null) {
            Integer nextC = cameras.higher(newPos);
            // if it is possible to move the next next camera to left
            if (nextC != null && nextE + L >= elephants.floorKey(nextC + L)) {
                cameras.remove(nextC);
            }

            // we need to add him to cameras
            cameras.add(nextE);
        }
    }

    private static void step(TreeMap<Integer, Integer> elephants, TreeSet<Integer> cameras, int[] pos,
                             int elephant, int newPos, int L) {
        int oldPos = pos[elephant];
        Integer count = elephants.get(oldPos);
        if (count == 1) {
            //if this is camera-based elephant
            if (cameras.contains(oldPos)) {
                Integer nextE = elephants.higherKey(oldPos);

                // if there is next elephant
                if (nextE != null) {
                    Integer nextC = cameras.higher(oldPos);
                    // if it is possible to move the next next camera to left
                    moveToLeft(elephants, cameras, nextC, nextE, L);

                    // we need to add him to cameras
                    cameras.add(nextE);
                }

                // remove old pos from cameras
                cameras.remove(oldPos);
            }

            elephants.remove(oldPos);
        } else {
            elephants.put(oldPos, count - 1);
        }

        count = elephants.get(newPos);
        if (count != null) {
            elephants.put(newPos, count + 1);
        } else {
            Integer prevC = cameras.ceiling(newPos - L);

            // if there is no camera that can shot the new elephant,
            // then we probably could move the next camera to left
            if (prevC == null || prevC + L < newPos) {
                Integer nextC = cameras.higher(newPos);

                // if there is a next camera
                if (nextC != null) {
                    // if it is possible to move the next next camera to left
                    if (nextC != null && newPos + L >= elephants.floorKey(nextC + L)) {
                        cameras.remove(nextC);
                    }
                }

                // add new pos to cameras
                cameras.add(newPos);
            }

            elephants.put(newPos, 1);
        }

        pos[elephant] = newPos;
    }

    private static boolean addValue(int pos, TreeMap<Integer, Integer> elephants) {
        Integer number = elephants.get(pos);
        if (number == null) {
            elephants.put(pos, 1);
            return true;
        } else {
            elephants.put(pos, number + 1);
            return false;
        }
    }

    private static TreeSet<Integer> evaluate(TreeMap<Integer, Integer> elephants, int L) {
        TreeSet<Integer> cameras = new TreeSet<>();
        Iterator<Integer> it = elephants.keySet().iterator();
        int pos = it.next();
        cameras.add(pos);

        while (it.hasNext()) {
            int y = it.next();
            if (pos + L < y) {
                pos = y;
                cameras.add(pos);
            }
        }

        return cameras;
    }
}
