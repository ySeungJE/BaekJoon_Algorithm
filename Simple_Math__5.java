package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Simple_Math__5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] apart;
		int flore, room_num,loop;
		loop = Integer.parseInt(br.readLine());
		for(int i=0; i<loop; i++) {
			flore=Integer.parseInt(br.readLine());
			room_num=Integer.parseInt(br.readLine());
			apart = new int[flore+1][room_num];
			for(int j=0; j<apart[0].length; j++) {
				apart[0][j] = j+1;	
			}
			for(int j=1; j<apart.length; j++) {
				for(int k=0; k<apart[0].length; k++) {
					if(k==0)
						apart[j][k] = 1;
					else
						for(int x=0; x<=k; x++) {
							apart[j][k] += apart[j-1][x];
						}
				}
			}
			bw.write(apart[flore][room_num-1]+"\n");
		}
		bw.flush();
	}
}
