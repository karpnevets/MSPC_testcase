import java.util.Scanner;
public class mspc_no5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int score = 0;
        for (int i = 0; i < num; i++) {
            score += s.nextInt();
        }
        System.out.println(score);
    }
}
