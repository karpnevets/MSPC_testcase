import java.io.*;
import java.util.*;
public class mspc_no15 {
    static int vertex,edge,start;
    static List<Node>[] list;
    static int[] dist;

    static final int INF = 100_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        vertex = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        list = new ArrayList[vertex+1];
        for (int i = 1; i <= vertex; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            list[Integer.parseInt(st.nextToken())].add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        dist = new int[vertex+1];
        Arrays.fill(dist, INF);
        dijkstra(start);
        if (dist[end] == INF)
            System.out.println(-1);
        else
            System.out.println(dist[end]);
    }
    private static void dijkstra(int start){
        PriorityQueue<Node> queue = new PriorityQueue<>();
        boolean[] check = new boolean[vertex + 1];
        queue.add(new Node(start, 0));
        dist[start] = 0;

        while(!queue.isEmpty()){
            Node curNode = queue.poll();
            int cur = curNode.next;
            if(check[cur] == true) continue;
            check[cur] = true;
            for(Node node : list[cur]){
                if(dist[node.next] > dist[cur] + node.weight){
                    dist[node.next] = dist[cur] + node.weight;
                    queue.add(new Node(node.next, dist[node.next]));
                }
            }
        }
    }
}
