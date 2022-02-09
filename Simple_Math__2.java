package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simple_Math__2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		long n = 1, num;
		num = Integer.parseInt(br.readLine());
		if (num == 1)
			System.out.print(1);
		else {
			while (true) {
				if (n >= num) {
					count++;
					break;
				}
				n = n + (6 * ++count);
			}
			System.out.print(count);
		}
	}
}
