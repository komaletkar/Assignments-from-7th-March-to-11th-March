package java_fundamentals;

import java.util.Scanner;

public class March_8_th_add2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int[][] arr1 = new int[n][m];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		int res[][] = new int[3][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)

			{
				res[i][j] = arr[i][j]+arr1[i][j];
			
		
		System.out.print(res[i][j] + " ");
		}
			System.out.println();
		}
	}

}
