package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simple_Math__0 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 0, count = 1;
		int num, n = 1,for_n;
		boolean vector;
		num = Integer.parseInt(br.readLine());
		if (num == 1)
			System.out.print("1/1");
		else {
			while (true) {
				if (num <= (n += ++count))
					break;
			}
			for_n = n-count;
			if(count%2==0) {
				vector=false;
				b=++count;
			}
			else {
				vector=true;
				a=++count;
			}
			if(vector) 
				for(int i=for_n+1; i<=num; i++) {
					a--;b++;				
				}
			else 
				for(int i=for_n+1; i<=num; i++) {
					a++;b--;	
				}
			System.out.print(a+"/"+b);
			
		}
	}
}
