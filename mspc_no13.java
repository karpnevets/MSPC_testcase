import java.io.*;
import java.util.*;
public class mspc_no13 {
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int volume;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        grid = new int[size][size]; visited = new boolean[size][size];
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j = 0; j < size; j++) {
                grid[i][j] = Integer.parseInt(s.substring(j, j+1));
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j]>0 && !visited[i][j]){
                    volume = grid[i][j];
                    DFS(i, j, size);
                    res.add(volume);
                }
            }
        }
        System.out.println(res.size());
        Collections.sort(res, Comparator.reverseOrder());
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
    static void DFS(int x, int y, int size){
        visited[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx >= 0 && ny >= 0 && nx < size && ny < size && !visited[nx][ny] && grid[nx][ny] > 0) {
                volume += grid[nx][ny];
                DFS(nx,ny, size);
            }
        }
    }
}
