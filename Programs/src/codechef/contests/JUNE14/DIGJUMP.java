package codechef.contests.JUNE14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DIGJUMP {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int index[] = new int[10];
		for (int i = 0; i < 10; i++)
			index[i] = -1;
		int ans[] = new int[input.length()];
		index[input.charAt(0) - '0'] = 0;
		for (int i = 1; i < input.length(); i++) {
			System.out.print((input.charAt(i) - '0')+" ");
		}System.out.println();
		for (int i = 1; i < input.length(); i++) {
			if (index[input.charAt(i) - '0'] == -1) {
				ans[i] = ans[i - 1] + 1;
				index[input.charAt(i) - '0'] = ans[i];
				System.out.print(ans[i]+" ");
			} else {
				ans[i] = Math.min(ans[i - 1] + 1,
						index[input.charAt(i) - '0'] + 1);
				System.out.print(ans[i]+" ");
			}
		}
		System.out.println();
		System.out.println(ans[input.length() - 1]);
	}
}