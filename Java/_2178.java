package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

class Point{

    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class _2178 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num = br.readLine().trim().split(" ");
        int n = Integer.valueOf(num[0]);
        int m = Integer.valueOf(num[1]);

        int[][] maze = new int[n][m];
        int[][] cost = new int[n][m];

        for(int i = 0; i < n; i++){
            String s = br.readLine().trim();
            for(int j = 0; j < m; j++){
                maze[i][j] = s.charAt(j) - '0';
            }
        }

        Queue<Point> queue = new LinkedList<>();

        maze[0][0] = -1;
        cost[0][0] = 1;
        queue.offer(new Point(0, 0));

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while(!queue.isEmpty()){

            Point p = queue.poll();

            for(int i = 0; i < dx.length; i++){

                int x = p.x + dx[i];
                int y = p.y + dy[i];

                if(x >= n || y >= m || x < 0 || y < 0 || maze[x][y] == 0 || maze[x][y] == -1){
                    continue;
                } else{
                    maze[x][y] = -1;
                    cost[x][y] = cost[p.x][p.y] + 1;
                    queue.offer(new Point(x, y));
                }
            }
        }

        System.out.print(cost[n-1][m-1]);

        br.close();
    }
}
