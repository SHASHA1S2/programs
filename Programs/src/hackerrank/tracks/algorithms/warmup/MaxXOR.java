package hackerrank.tracks.algorithms.warmup;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxXOR {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int r = Integer.parseInt(br.readLine());
		int res = 0;
		for (int i = l; i <= r; i++) {
			for (int j = l; j <= r; j++) {
				if ((i ^ j) > res) {
					res = i ^ j;
				}
			}
		}
		System.out.println(res);
	}
}
