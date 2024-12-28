import java.util.*;
public class mspc_no6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int target = s.nextInt();
        int[] cards = new int[num];
        for (int i = 0; i < num; i++) {
            cards[i] = s.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            if (cards[i] <= target)
                max1 = Math.max(cards[i], max1);
        }
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                int temp = cards[i]+cards[j];
                if (temp <= target)
                    max2 = Math.max(temp, max2);
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = i+1; j < num; j++) {
                for (int k = j+1; k < num; k++) {
                    int temp = cards[i]+cards[j]+cards[k];
                    if (temp <= target)
                        max3 = Math.max(temp, max3);
                }
            }
        }
        int max = Math.max(max1, max2);
        System.out.println(Math.max(max, max3));
    }
}
