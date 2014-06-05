import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoveLetterMystery {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String str = br.readLine();
			char arr[] = str.toCharArray();
			int res = 0,n=arr.length;
			for(int i=0;i<n/2;i++){
				res += Math.abs(arr[i]-arr[n-i-1]);
			}
			System.out.println(res);
		}
	}
}
