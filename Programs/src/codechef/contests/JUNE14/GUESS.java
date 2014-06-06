package codechef.contests.JUNE14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GUESS {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String input[] = br.readLine().split(" ");
			long n = Long.parseLong(input[0]);
			long m = Long.parseLong(input[1]);
			if (n == 1 && m == 1) {
				System.out.println("0/1");
			} else if (n % 2 != 0 && m % 2 != 0) {
				System.out.println((n * m / 2) + "/" + (n * m));
			} else {
				System.out.println("1/2");
			}
		}
	}
}
