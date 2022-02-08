package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String__5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] i_arr = new int[26];
		int count=0,max=0,index=0;
		String s = br.readLine().toUpperCase();
		char[] c_arr = s.toCharArray();
		for(int i=0; i<c_arr.length; i++) {
			for(int j=65; j<=90; j++) {
				if(c_arr[i]==(char)j)
					i_arr[j-65]++;
			}
		}
		for(int i=0; i<26;i++) 
			if(i_arr[i]>max)
				max = i_arr[i];
		for(int i=0; i<26; i++) 
			if(i_arr[i]==max) {
				count++;
				index=i;
			}
		if(count==1)
			System.out.print((char)(index+65));
		else
			System.out.print('?');
	}
}
