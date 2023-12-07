import java.io.*;
import java.util.*;
public class BJ7569 {
    static int[][][] box;
    static List<Tomato> list = new ArrayList<>();
    static int H, N, M;
    static int[] dy = {0, 1, 0, -1, 0, 0};
    static int[] dx = {1, 0, -1, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        box = new int[H][N][M];

        // 토마토 상자에 입력받기
        for(int i=0; i<H; i++) {
            for(int j=0; j<N; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<M; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                    if(box[i][j][k]==1) {
                        list.add(new Tomato(i, j, k));
                    }
                }
            }
        }

        int res = bfs(0, 0, 0)-1;
        for(int i=0; i<H; i++) {
            for(int j=0; j<N; j++) {
                for(int k=0; k<M; k++) {
                    if(box[i][j][k]==0) {
                        res = -1;
                        break;
                    }
                }
            }
        }

        System.out.println(res);
    }

    static int bfs(int y, int x, int z) {
        Queue<Tomato> qu = new LinkedList<>();
        for(int i=0; i<list.size(); i++) {
            qu.offer(list.get(i));
        }

        while(!qu.isEmpty()) {
            Tomato cur = qu.poll();
            y = cur.getY();
            x = cur.getX();
            z = cur.getZ();

            for(int i=0; i<6; i++) {
                int ny = y+dy[i];
                int nx = x+dx[i];
                int nz = z+dz[i];

                if(ny<0 || ny>=N || nx<0 || nx>=M || nz<0 || nz>=H) {
                    continue;
                }
                if(box[ny][nx][nz] == 0) {
                    qu.offer(new Tomato(ny, nx, nz));
                    box[ny][nx][nz] = box[y][x][z]+1;
                }
            }
        }
        return box[y][x][z];
    }
}

class Tomato {
    int y; int x; int z;
    Tomato(int y, int x, int z) {
        this.y=y; this.x=x; this.z=z;
    }
    int getY(){return y;}
    int getX(){return x;}
    int getZ(){return z;}

}

