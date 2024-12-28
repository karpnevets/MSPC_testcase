import java.util.*;
import java.io.*;
public class mspc_no12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int vertex = Integer.parseInt(st.nextToken());
        boolean[][] adj = new boolean[node][node];
        for (int i = 0; i < vertex; i++) {
            st = new StringTokenizer(br.readLine());
            adj[Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1] = true;
        }
        int count = 0;
        for (int i = 0; i < node; i++) {
            for (int j = i + 1; j < node; j++) {
                if (adj[i][j] && adj[j][i])
                    count++;
            }
        }
        System.out.println(count);
    }
}