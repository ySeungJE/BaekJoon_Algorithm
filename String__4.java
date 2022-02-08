package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class String__4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int re_num;
		String[] s_arr;
		StringTokenizer st;
		String s;
		for(int i=0; i<n; i++) {
			String test = "";
			st = new StringTokenizer(br.readLine()," ");
			re_num = Integer.parseInt(st.nextToken());
			s=st.nextToken();
			s_arr = s.split("");
			for(int j=0; j<s_arr.length; j++) {
				for(int k=0; k<re_num; k++)
					test += s_arr[j];
			}
			bw.write(test+'\n');
		}
		bw.flush();
	}
}
