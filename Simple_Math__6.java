package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Simple_Math__6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer=0, rest=0;
		int sugar = Integer.parseInt(br.readLine());
		rest = sugar%5;
		answer = sugar/5;
		if(rest==0) System.out.print(answer);
		else if(rest%3==0) System.out.print((answer+rest/3));
		else {
			List<Integer> list = new ArrayList<>();
			for(int i=1; i*5<sugar; i++) {
				if((sugar-i*5)%3==0) {
					list.add(i+(sugar-i*5)/3);
				}
			}
			if(list.isEmpty()) {
				System.out.print((sugar%3==0) ? (sugar/3) : -1);	
			}
			else 
				System.out.print(list.parallelStream().mapToInt(i->i).min().getAsInt());
		}
	}
}
