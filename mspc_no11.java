import java.util.*;
import java.io.*;
public class mspc_no11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken()); String target = st.nextToken();
        int start=0;
        String[] teachers = new String[num];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            teachers[i] = st.nextToken();
            if (teachers[i].equals(target))
                start = i;
            int[] temp = {i, Integer.parseInt(st.nextToken())};
            q.offer(temp);
        }
        for (int i = 0; i < start; i++) {
            q.offer(q.poll());
        }
        int next = q.peek()[1];
        while (q.size() > 1) {
            for (int i = 0; i < next; i++) {
                q.offer(q.poll());
            }
            next = q.poll()[1]-1;
        }
        System.out.println(teachers[q.poll()[0]]);
    }
}
