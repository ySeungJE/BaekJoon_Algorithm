package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Simple_Math__1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a=0,b=0,c=0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		a=Integer.parseInt(st.nextToken());
		b=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		System.out.print((b>=c) ? -1 : (a/(c-b)+1));
	}
}
