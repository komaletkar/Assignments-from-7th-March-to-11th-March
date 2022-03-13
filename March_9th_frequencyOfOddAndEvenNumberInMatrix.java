package java_fundamentals;

import java.util.Scanner;

public class March_9th_frequencyOfOddAndEvenNumberInMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int odd=0;
		int even=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]%2==0)
				{
					even++;
				}
				else
				{
					odd++;
				}
			}
			}
		System.out.println("Frequency of even number is : " + even);
		System.out.println("Frequency of odd number is : " + odd);

	}

}
