package MultipleCatch;

public class CatchExercise {

	public static void main(String[] args) {
		 try {
	            
	            int[] a = new int[5];
	            
	            a[5] = 30 / 5;
	        } catch (ArithmeticException e) {
	            
	            System.out.println("Arithmetic Exception: " + e.getMessage());
	        } catch (ArrayIndexOutOfBoundsException e) {
	           
	            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
	        } finally {
	            
	            System.out.println("Finally block executed.");
	        }

	}

}
