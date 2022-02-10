package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Simple_Math__4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int gest,loop,h,w,flore,room_num;
		loop = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0; i<loop; i++) {
			st = new StringTokenizer(br.readLine()," ");
			h=Integer.parseInt(st.nextToken());
			w=Integer.parseInt(st.nextToken());
			gest=Integer.parseInt(st.nextToken());
			room_num = (gest%h==0) ? (gest/h) : ((gest/h)+1);
			flore = (gest%h==0) ? h : (gest%h);
			bw.write( (flore*100)+room_num + "\n");
		}
		bw.flush();
	}
}
