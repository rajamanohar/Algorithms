package hackerrank.alldomain.algorithms.implementation;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class SherlockBest {
	public SherlockBest() {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int num5 = 0, num3 = 0;
			int cur = sc.nextInt();
			num5 = cur - cur % 3;

			if (cur % 3 == 1) {
				num5 -= 9;
				num3 += 10;
			} else if (cur % 3 == 2) {
				num5 -= 3;
				num3 += 5;
			}
			if (num5 < 0) {
				System.out.println("-1");
			} else {
				String str1 = new String(new char[num5]).replace("\0", "5");
				String str2 = new String(new char[num3]).replace("\0", "3");
				System.out.println(str1 + str2);
			}
		}

	}
}
