package java_fundamentals;

public class March_10th_nestedTryStatement {

	public static void main(String[] args) {
		try{    
			    try{    
			     System.out.println("It shows divide by 0 error");    
			     int b =39/0;    
			   }  
			    
			    catch(ArithmeticException e)  
			    {  
			      System.out.println(e);  
			    }    
			       
			    try{    
			    int a[]=new int[5];    
			     a[5]=4;    
			     }  
			    catch(ArrayIndexOutOfBoundsException e)  
			    {  
			       System.out.println(e);  
			    }    
			  
			      
			    System.out.println("catch block executed");    
			  }  
			  catch(Exception e)  
			  {  
			    System.out.println("handled the exception (outer catch)");  
			  }    
			    
			  
		
			
	}

}
