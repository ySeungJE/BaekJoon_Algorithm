package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String__7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2;
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		StringBuilder sb = new StringBuilder();
		num1=Integer.parseInt(sb.append(st.nextToken()).reverse().toString());
		sb = new StringBuilder();
		num2=Integer.parseInt(sb.append(st.nextToken()).reverse().toString());
		System.out.print((num1>num2) ? num1 : num2);
	}
}
