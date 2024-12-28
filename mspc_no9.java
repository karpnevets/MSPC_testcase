import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
public class mspc_no9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int[][] sn = new int[num][num];
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num; j++) {
                sn[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < num; i++) {
            Arrays.sort(sn[i]);
        }
        Arrays.sort(sn, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[num-1]-o2[num-1];
            }
        });
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += sn[i][i];
        }
        System.out.println(sum);
    }
}
