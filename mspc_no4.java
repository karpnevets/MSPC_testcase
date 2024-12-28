import java.util.Comparator;
import java.util.Scanner;
import   java.util.Arrays;
public class mspc_no4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String[][] students = new String[num][2];
        for (int i = 0; i < num; i++) {
            students[i][0] = s.next();
            students[i][1] = s.next();
        }
        Arrays.sort(students, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[1].compareTo(o2[1]);
            }
        });
        String first = students[0][1];
        int i = 0;
        while(students[i][1].equals(first)){
            System.out.println(students[i][0]);
            i++;
        }
    }
}
