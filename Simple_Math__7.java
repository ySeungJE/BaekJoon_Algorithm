package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Simple_Math__7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigInteger bi1=new BigInteger(st.nextToken());
		BigInteger bi2=new BigInteger(st.nextToken());	
		System.out.print(bi1.add(bi2));
	}	
}
