package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class String__10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] word;
		char test;
		boolean[] b_arr;
		String s;
		int n = Integer.parseInt(br.readLine());
		int count=0;
		for(int i=0; i<n; i++) {
			b_arr = new boolean[26];
			count++;
			s = br.readLine();
			word = s.toCharArray();
			test = word[0];
			for(int j=0; j<word.length; j++) {
				if(test!=word[j]) {
					if(b_arr[(int)word[j]-97]) {
						count--;
						break;
					}
					b_arr[(int)test-97]=true;
					test = word[j];
				}
			}
		}
		System.out.print(count);
	}
}
