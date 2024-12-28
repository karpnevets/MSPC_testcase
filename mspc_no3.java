import java.util.*;
public class mspc_no3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i = 0; i < num; i++){
            String temp = s.next();
            if (s.next().equals("Mapo"))
                System.out.println(temp);
        }
    }
}

