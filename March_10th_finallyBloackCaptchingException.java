package java_fundamentals;

public class March_10th_finallyBloackCaptchingException {

	public static void main(String[] args) {
		int a=24;
		int b=0;
		try {
            System.out.println(a/ b);
        }
        catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }
        finally {
            
            System.out.println("finally : i execute always.");
            
        }
	}

}
