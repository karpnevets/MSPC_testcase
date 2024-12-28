import java.util.*;
import java.io.*;
public class mspc_no8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int limit = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        String[] students = new String[num];
        double[][] time = new double[num][2];
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            students[i] = st.nextToken();
            time[i][0] = i;
            time[i][1] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(time, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o1[1], o2[1]);
            }
        });
        System.out.println(students[(int)time[limit][0]]);
    }
}
