package BufferedReader2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedReader3 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String st = br.readLine();
//		bw.write(st);
//		bw.close();
		
		StringTokenizer st2;
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < cnt; i++) {
			st2 = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st2.nextToken()) + Integer.parseInt(st2.nextToken())) + "\n");
		}
		bw.close();
	}

}
