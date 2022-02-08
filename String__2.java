package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String__2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long number = Integer.parseInt(br.readLine());
		int sum=0;
		String s = br.readLine();
		String[] s_arr = s.split("");
		for(int i=0; i<number; i++)
			sum+=Integer.parseInt(s_arr[i]);
		System.out.println(sum);
	}
}
