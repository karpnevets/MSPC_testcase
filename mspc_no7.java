import java.util.StringTokenizer;
import java.io.*;
public class mspc_no7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            System.out.println(st.countTokens());
        }
    }
}
