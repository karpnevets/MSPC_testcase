import java.util.*;
import java.io.*;
public class mspc_no14 {
    static int[] cost, score;
    static String[] name;
    static int num, budget;
    static long[][] memo;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        num = Integer.parseInt(st.nextToken());
        budget = Integer.parseInt(st.nextToken());
        name = new String[num];
        cost = new int[num+1];
        score = new int[num+1];
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            name[i] = st.nextToken();
            cost[i+1] = Integer.parseInt(st.nextToken());
            score[i+1] = Integer.parseInt(st.nextToken());
        }
        if (Math.log(num*budget)/Math.log(2) < num){
            memo = new long[num+1][budget+1];
            DP();
        }
        else
            BF();
    }
    static void DP(){
        for (int i = 0; i <= budget; i++) {
            memo[0][i] = 0;
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= budget; j++) {
                if (cost[i] > j)
                    memo[i][j] = memo[i-1][j];
                else
                    memo[i][j] = Math.max(memo[i-1][j], memo[i-1][j-cost[i]] + score[i]);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        int x = budget;
        for (int i = num; i > 0; i--) {
            if (memo[i][x] != memo[i-1][x]){
                res.add(i - 1);
                x -= cost[i];
            }
        }
        for (int i = res.size() -  1; i >= 0; i--) {
            System.out.println(name[res.get(i)]);
        }
    }
    static void BF() {
        ArrayList<Integer> res = new ArrayList<>();
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < (int)(Math.pow(2, num)); i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            long[] total = {0, 0};
            for (int j = 0; j < num; j++) {
                if (((i >> j) & 1)==1){
                    total[0] += cost[j+1];
                    total[1] += score[j+1];
                    temp.add(j);
                }
            }
            if (total[0] <= budget && total[1] > max){
                max = total[1];
                res = temp;
            }
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.println(name[res.get(i)]);
        }
    }
}
