package java_fundamentals;

import java.util.Scanner;

public class March_10th_handleExceptionUsingThrowKeyword {
	 public static void validate(int age) {  
	        if(age<18) {  
	            
	            throw new ArithmeticException("Person is not eligible to vote");    
	        }  
	        else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	    }  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		validate(age);  
	}

}
