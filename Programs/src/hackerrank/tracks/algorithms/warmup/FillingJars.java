package hackerrank.tracks.algorithms.warmup;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FillingJars {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		long sum = 0;
		while (m-- > 0) {
			input = br.readLine().split(" ");
			long a = Long.parseLong(input[0]);
			long b = Long.parseLong(input[1]);
			long k = Long.parseLong(input[2]);
			sum += (b - a + 1) * k;
		}
		System.out.println(sum/n);
	}
}
