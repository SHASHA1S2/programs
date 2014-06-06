package codechef.contests.JUNE14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHEFZOT {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		String input[] = br.readLine().split(" ");
		int res = 0, count = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
			if (arr[i] > 0) {
				count++;
				if (count > res)
					res = count;
			} else {
				count = 0;
			}
		}
		System.out.println(res);
	}
}
