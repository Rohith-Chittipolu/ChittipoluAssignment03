package q12;

public class trycwatc {
	public static void main(String args[]) {
	    try {
	        System.out.println("Execute try block");
	        throw new Exception();
	    } catch (Exception e) {
	        System.out.println("Execute catch block");
	    } finally {
	        System.out.println("Execute finally block");
	    }
	}

}
