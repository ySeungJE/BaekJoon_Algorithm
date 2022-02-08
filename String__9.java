package BeakJoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String__9 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int count =0;
		if(s.contains("c=")) 
			s = s.replace("c=", " "); 
		if(s.contains("c-")) 
			s = s.replace("c-", " ");  
		if(s.contains("dz=")) 
			s=s.replace("dz=", " ");  
		if(s.contains("d-")) 
			s=s.replace("d-", " ");  
		if(s.contains("lj")) 
			s=s.replace("lj", " ");  
		if(s.contains("nj")) 
			s=s.replace("nj", " ");  
		if(s.contains("s=")) 
			s=s.replace("s=", " ");  
		if(s.contains("z=")) 
			s=s.replace("z=", " ");
		count = s.toCharArray().length;
		System.out.print(count);
	}
}
