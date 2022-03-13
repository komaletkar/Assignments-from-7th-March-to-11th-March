package java_fundamentals;

import java.util.Scanner;

public class March_9th_lowerTriangleMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
			  if(i>=j)
			  {
				  System.out.print(arr[i][j] + " ");
			  }
			 
			}
			System.out.println();
		}

	}

}
