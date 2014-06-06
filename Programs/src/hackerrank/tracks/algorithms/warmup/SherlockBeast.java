package hackerrank.tracks.algorithms.warmup;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SherlockBeast {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n5 = 0, n3 = 0;
			boolean flag = false;
			int n = Integer.parseInt(br.readLine());
			if (n == 3) {
				System.out.println("555");
			} else if (n == 5) {
				System.out.println("33333");
			} else if (n < 5) {
				System.out.println("-1");
			} else {
				while (true) {
					if (n % 3 == 0) {
						n5 = n;
						break;
					} else if (n < 3) {
						flag = true;
						break;
					}
					n3 += 5;
					n -= 5;
				}
				if (flag) {
					System.out.println("-1");
				} else {
					StringBuilder sb = new StringBuilder();
					for (int i = 0; i < n5; i++)
						sb.append("5");
					for (int i = 0; i < n3; i++)
						sb.append("3");
					System.out.println(sb.toString());
				}
			}
		}
	}
}
