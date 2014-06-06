package hackerrank.tracks.algorithms.warmup;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChocolateFeast {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]), c = Integer.parseInt(input[1]), m = Integer
					.parseInt(input[2]);
			int tofee = 0, newtofee, wrappers;
			newtofee = n / c;
			tofee += newtofee;
			wrappers = tofee;
			while (wrappers >= m) {
				newtofee = wrappers / m;
				tofee += newtofee;
				wrappers = newtofee + (wrappers % m);
			}
			System.out.println(tofee);
		}
	}
}
