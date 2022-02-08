package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class String__3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		char[] c_arr = s.toCharArray();
		int[] check = new int[26];
		Arrays.fill(check, -1);
		for(int i=97;i<=122;i++) {
			for(int j=0; j<c_arr.length; j++) {
				if(check[i-97]!=-1)
					break;
				if(c_arr[j]==(char)i)
					check[i-97] = j;
			}
		}
		for(int i=0; i<26; i++)
			bw.write(check[i]+" ");
		bw.flush();
	}
}
