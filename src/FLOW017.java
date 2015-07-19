import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Igor_Sokolov on 7/14/2015.
 */
public class FLOW017 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine().trim());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            int nums[] = new int[3];
            for (int j = 0; j < nums.length; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }

            insertSort(nums);
            System.out.println(nums[1]);
        }
    }

    private static void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int t = nums[i];

            int j;
            for (j = i - 1; j >= 0 && nums[j] < t; j--) {
                nums[j + 1] = nums[j];
            }

            nums[j + 1] = t;
        }
    }
}
