package java_fundamentals;

public class March_11th_Test {

	public static void main(String[] args) {
		byte num;
		System.out.println("Scientech");
		try {
			num=Byte.parseByte("Easy");
			System.out.println("num"+num);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		
	}
	}
}
