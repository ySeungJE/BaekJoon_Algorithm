package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String__8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char[] c_arr = s.toCharArray();
		int sum=0;
		for(int i=0; i<c_arr.length; i++) {
			if(c_arr[i]=='A'||c_arr[i]=='B'||c_arr[i]=='C')
				sum+=3;
			else if(c_arr[i]=='D'||c_arr[i]=='E'||c_arr[i]=='F')
				sum+=4;
			else if(c_arr[i]=='G'||c_arr[i]=='H'||c_arr[i]=='I')
				sum+=5;
			else if(c_arr[i]=='J'||c_arr[i]=='K'||c_arr[i]=='L')
				sum+=6;
			else if(c_arr[i]=='M'||c_arr[i]=='N'||c_arr[i]=='O')
				sum+=7;
			else if(c_arr[i]=='P'||c_arr[i]=='Q'||c_arr[i]=='R'||c_arr[i]=='S')
				sum+=8;
			else if(c_arr[i]=='T'||c_arr[i]=='U'||c_arr[i]=='V')
				sum+=9;
			else if(c_arr[i]=='W'||c_arr[i]=='X'||c_arr[i]=='Y'||c_arr[i]=='Z')
				sum+=10;
		}
		System.out.print(sum);
	}
}
