import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManasaStones {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			if (b < a) {
				int temp = a;
				a = b;
				b = temp;
			}
			int res = (n-1) * a;
			if(a==b){
				System.out.print(res);
			}
			else{
				for (int i = 0; i < n; i++) {
					System.out.print(res);
					if(i<n-1)
						System.out.print(" ");
					res-=a;
					res+=b;
				}
			}
			System.out.println();
		}
	}
}
