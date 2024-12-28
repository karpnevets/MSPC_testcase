import java.util.*;
import java.io.*;
public class mspc_no10 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int category = Integer.parseInt(st.nextToken());
        Map<String, List<String[]>> subject = new HashMap<>();
        Map<String, Integer> required = new LinkedHashMap<>();
        for (int i = 0; i < category; i++) {
            st = new StringTokenizer(br.readLine());
            required.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            String[] temp = new String[2];
            temp[0] = st.nextToken();
            String cate = st.nextToken();
            temp[1] = st.nextToken();
            if (subject.containsKey(cate)){
                subject.get(cate).add(temp);
            } else {
                List<String[]> l = new ArrayList<>();
                l.add(temp);
                subject.put(cate, l);
            }
        }
        StringBuilder res = new StringBuilder();
        for (Map.Entry<String, Integer> entry : required.entrySet()) {
            res.append(helper(subject.get(entry.getKey()), entry.getValue()));
        }
        System.out.println(res);
    }
    static String helper(List<String[]> l, int required){
        int count = 0;
        boolean[] yes = new boolean[l.size()];
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i)[1].equals("0") && required > count) {
                yes[i] = true; count++;
            }
            if (count == required)
                break;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i)[1].equals("1") && required > count) {
                yes[i] = true; count++;
            }
            if (count == required)
                break;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < l.size(); i++) {
            if (yes[i]){
                res.append(l.get(i)[0] + "\n");
            }
        }
        return res.toString();
    }
}
