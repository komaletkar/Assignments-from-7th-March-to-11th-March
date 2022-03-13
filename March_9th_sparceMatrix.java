package java_fundamentals;

import java.util.Scanner;

public class March_9th_sparceMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		int[][] arr = new int[n][m];
		n = arr.length;
		m = arr[0].length;
		int size = n * m;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0)
					count++;
			}
		}

		if (count > (size / 2))
			System.out.println("Given matrix is a sparse matrix");
		else
			System.out.println("Given matrix is not a sparse matrix");

	}

}
