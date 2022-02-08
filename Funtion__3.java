package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Funtion__3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int answer=0;
		if(n<100)
			System.out.println(n);
		else {
			answer+=99;
			if(n<111)
				System.out.println(answer);
			else {
				char[] c;
				for(int i=111; i<=n; i++) {
					c=Integer.valueOf(i).toString().toCharArray();
					if((c[1]-c[0])==(c[2]-c[1]))
						answer++;
				}
				System.out.println(answer);
			}
		}
	}
}
